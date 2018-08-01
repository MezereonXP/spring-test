package com.mezereon.springtest.controller;

import com.mezereon.springtest.dao.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SearchController
 * @description: The controller to search
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/8/2
 **/
@RestController
public class SearchController {

    @Autowired
    private GoodsMapper goodsMapper;

}
