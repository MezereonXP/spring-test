package com.mezereon.springtest.controller;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.RequestMobileCodeCallback;
import com.mezereon.springtest.bean.Customer;
import com.mezereon.springtest.bean.CustomerExample;
import com.mezereon.springtest.dao.CustomerMapper;
import com.mezereon.springtest.response.Response;
import com.mezereon.springtest.service.CustomerService;
import com.mezereon.springtest.util.Util;
import com.qiniu.common.Zone;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class CustomerController {

    private static final String AK = "abU8ljS-9-uzNytI930nbkM656gRN0JQXc393gB0";
    private static final String SK = "STkJeKm7sPreBn_I0tneJQLDg8AMAL7-45v5cike";

    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerMapper customerMapper;

    @RequestMapping(value = "/api/regist", method = RequestMethod.POST)
    @CrossOrigin
    public Response regist(@RequestBody Customer customer) {

        Response response = new Response();
        try {
            customer.setcPassword(Util.getSha1(customer.getcPassword()));
            customerService.regist(customer);
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/reset", method = RequestMethod.POST)
    @CrossOrigin
    public Response reset(@RequestBody Customer customer) {

        Response response = new Response();
        try {
            customer.setcPassword(Util.getSha1(customer.getcPassword()));
            customerService.reset(customer);
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            return response;
        }
    }

    @RequestMapping(value = "/api/selectCustomerById", method = RequestMethod.GET)
    @CrossOrigin
    public Response selectCustomerById(int customerId) {
        Response response = new Response();
        try {
            Customer customer = customerService.selectCustomerById(customerId);

            response.setData(customer);
            return response;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            response.setStatus(false);
            response.setMsg(e.getMessage());
            return response;
        }
    }

    @RequestMapping(value = "/api/login", method = RequestMethod.GET)
    @CrossOrigin
    public Response login(HttpServletRequest req, HttpServletResponse resq,
                          @RequestParam(value = "phone", required = true) String phone,
                          @RequestParam(value = "pwd", required = true) String pwd) {
        Response response = new Response();
        try {
            CustomerExample customerExample = new CustomerExample();
            customerExample.createCriteria().andCTelephoneEqualTo(phone);
            Customer customer = customerMapper.selectByExample(customerExample).get(0);
            response.setData(null);
            response.setStatus(customer.getcPassword().equals(Util.getSha1(pwd)));
            if (customer.getcPassword().equals(Util.getSha1(pwd))) {
                Date date = new Date(System.currentTimeMillis());
                DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
                Cookie cookie1 = new Cookie("damiPhone", phone);
                Cookie cookie2 = new Cookie("damiToken",
                        Util.getSha1(phone + Util.getSha1(pwd) + dateFormat.format(date)));
                System.out.println(cookie1.getName() + ":" + cookie1.getValue());
                System.out.println(cookie2.getName() + ":" + cookie2.getValue());
                cookie1.setPath("/");
                cookie1.setMaxAge(60 * 60 * 24);
                cookie2.setPath("/");
                cookie2.setMaxAge(60 * 60 * 24);
                resq.addCookie(cookie1);
                resq.addCookie(cookie2);
            }
            System.out.println(response.isStatus());
            return response;
        } catch (Exception e) {
            response.setStatus(false);
            response.setMsg(e.getMessage());
            return response;
        }

    }

    @RequestMapping(value = "/api/checklogin", method = RequestMethod.GET)
    @CrossOrigin
    public Response checklogin(HttpServletRequest req, HttpServletResponse resq) {

        Cookie[] cookies = req.getCookies();
        Response response = new Response();
        try {
            String damiPhone = "";
            String damiToken = "";
            boolean flag = false;

            for (int i = 0; i < cookies.length; i++) {
                if ("damiPhone".equals(cookies[i].getName())) {
                    damiPhone = cookies[i].getValue();
                    System.out.println("damiPhone" + damiPhone);
                    Date date = new Date(System.currentTimeMillis());
                    DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

                    CustomerExample customerExample = new CustomerExample();
                    customerExample.createCriteria().andCTelephoneEqualTo(damiPhone);

                    Customer customer = customerMapper.selectByExample(customerExample).get(0);

                    damiToken = Util.getSha1(damiPhone + customer.getcPassword() + dateFormat.format(date));

                }
            }
            for (int i = 0; i < cookies.length; i++) {
                if ("damiToken".equals(cookies[i].getName())) {
                    System.out.println("damiToken" + cookies[i].getValue());
                    if (cookies[i].getValue().equals(damiToken)) {
                        flag = true;
                    }
                }
            }

            response.setData(damiPhone);
            response.setStatus(flag);
            return response;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            response.setStatus(false);
            response.setMsg(e.getMessage());
            return response;
        }

    }

    @RequestMapping(value = "/api/getCustomerByPhone", method = RequestMethod.GET)
    @CrossOrigin
    public Response getCustomerByPhone(@RequestParam(value = "phone", required = true) String phone) {

        Response response = new Response();
        try {
            CustomerExample customerExample = new CustomerExample();
            customerExample.createCriteria().andCTelephoneEqualTo(phone);
            Customer customer = customerMapper.selectByExample(customerExample).get(0);
            response.setData(customer);
            return response;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            response.setStatus(false);
            response.setMsg(e.getMessage());
            return response;
        }
    }

    @RequestMapping(value = "/api/logout", method = RequestMethod.GET)
    @CrossOrigin
    public void logout(HttpServletRequest req, HttpServletResponse resq) {
       try{
           Cookie cookie1 = new Cookie("damiPhone", null);
           Cookie cookie2 = new Cookie("damiToken", null);
           cookie1.setPath("/");
           cookie1.setMaxAge(60 * 60 * 24);
           cookie2.setPath("/");
           cookie2.setMaxAge(60 * 60 * 24);
           resq.addCookie(cookie1);
           resq.addCookie(cookie2);
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }

    /**
     * 获得上传的签名
     *
     * @return
     */
    @RequestMapping(value = "/api/getSign", method = RequestMethod.GET)
    @CrossOrigin
    public Map<String, String> getSign() {
        Response response = new Response();
        try {
            response.setStatus(true);
            Auth auth = Auth.create(AK, SK);
            Map<String, String> result = new HashMap<String, String>();
            StringMap stringMap = new StringMap();
            stringMap.put("keyPrefix", "uploads");
            result.put("uptoken", auth.uploadToken("data", null, 3600L, stringMap));
            response.setData(result);
            return result;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return new HashMap<>();
        }
    }

    @RequestMapping(value = "/api/updateCustomer", method = RequestMethod.POST)
    @CrossOrigin
    public Response updateCustomer(@RequestBody Customer customer) {
        Response response = new Response();
        try {
            response.setStatus(true);
            customerMapper.updateByPrimaryKey(customer);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/upload", method = RequestMethod.POST)
    @CrossOrigin
    public Map<String, String> singleFileUpload(@RequestParam("file") MultipartFile file,
                                                RedirectAttributes redirectAttributes,
                                                @RequestParam("token") String token) {
        Map<String, String> map = new HashMap<>();
        //构造一个带指定Zone对象的配置类
        Configuration cfg = new Configuration(Zone.zone0());
        //...其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            map.put("message", "Please select a file to upload");
            return map;
        }

        try {
            // Get the file and save it somewhere
            Path path = Paths.get(new Date().getTime() + file.getOriginalFilename());
            uploadManager.put(file.getBytes(), path.toString(), token);
            map.put("link", "http://ol3p4szw6.bkt.clouddn.com/" + path.toString());
            return map;
        } catch (IOException e) {
            e.printStackTrace();
            map.put("error", e.getMessage());
            return map;
        }
    }

    @RequestMapping(value = "/api/sendMessage", method = RequestMethod.GET)
    @CrossOrigin
    public Response sendMessage(@RequestParam("phone") String phone) {
        Response response = new Response();
        try {
            response.setStatus(true);
            AVOSCloud.requestSMSCode(phone, "Dami", "验证", 10);
            return response;
        } catch (AVException e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/checkCode", method = RequestMethod.GET)
    @CrossOrigin
    public Response sendMessage(@RequestParam("phone") String phone,
                                @RequestParam("code") String code) {
        Response response = new Response();
        try {
            response.setStatus(true);
            AVOSCloud.verifySMSCode(code, phone);
            return response;
        } catch (AVException e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }
}