package com.orgin.demo.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dengqingling on 2019-08-16
 */
@FeignClient("simple-client")
public interface SimpleRequest {

    @RequestMapping("/simple/getRpcSimple")
    String getSimple();
}
