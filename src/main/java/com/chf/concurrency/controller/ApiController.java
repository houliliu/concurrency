package com.chf.concurrency.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * api
 *
 * @author 温柔一刀
 * @create 2019-09-22 16:53
 **/
@RestController
public class ApiController {
    @RequestMapping("/test")
    public String index() {
        return "test";
    }

}
