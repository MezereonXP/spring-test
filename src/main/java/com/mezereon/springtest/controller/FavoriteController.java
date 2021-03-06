package com.mezereon.springtest.controller;

import com.mezereon.springtest.bean.Favorite;
import com.mezereon.springtest.response.Response;
import com.mezereon.springtest.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FavoriteController {
    @Autowired
    FavoriteService favoriteService;

    @RequestMapping(value = "/api/selectFavoriteByCustomerId", method = RequestMethod.GET)
    @CrossOrigin
    public Response selectFavoriteByCustomerId(int customerId) {
        Response response = new Response();
        try {
            List<Favorite> list = favoriteService.selectFavoriteByCustomerId(customerId);

            response.setData(list);
            return response;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            response.setStatus(false);
            response.setMsg(e.getMessage());
            return response;
        }
    }

    @RequestMapping(value = "/api/delete", method = RequestMethod.POST)
    @CrossOrigin
    public void deleteFavorite(@RequestBody Favorite favorite) {
        try {
            favoriteService.deleteFavorite(favorite);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    @RequestMapping(value = "/api/addFavorite", method = RequestMethod.POST)
    @CrossOrigin
    public void addFavorite(@RequestBody Favorite favorite) {
        try {
            favoriteService.addFavorite(favorite);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

}
