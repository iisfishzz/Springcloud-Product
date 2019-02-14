package com.imooc.product.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 廖师兄
 * 2017-12-10 20:37
 */
@RestController
public class ServerController {

    @RequestMapping(value = "msg" ,method= RequestMethod.GET)
    public String msg() {
        return "this is product msg";
    }
}







