package com.orgin.demo.controller;

import com.orgin.demo.rpc.SimpleRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dengqingling on 2019-08-16
 */
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private SimpleRequest simpleRequest;

    @RequestMapping("/getSimple")
    public String getSimple() {
        return simpleRequest.getSimple();
    }
}
