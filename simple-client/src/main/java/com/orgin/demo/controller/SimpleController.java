package com.orgin.demo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dengqingling on 2019-08-15
 */
@Slf4j
@RequestMapping("/simple")
@RestController
public class SimpleController {


    @HystrixCommand(fallbackMethod = "getDefaultSimple")
    @RequestMapping("/getSimple")
    public Object getSimple() {
        log.info("准备调用 getSimple");
        throw new RuntimeException("超时了");
    }

    @RequestMapping("/getDefaultSimple")
    public Object getDefaultSimple() {
        log.info("执行回调");
        return "失败回调";
    }

    @RequestMapping("/getRpcSimple")
    public Object getRpcSimple() {
        log.info("被远程调用啦");
        return "远程调用";
    }
}
