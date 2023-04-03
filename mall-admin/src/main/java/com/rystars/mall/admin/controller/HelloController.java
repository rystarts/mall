package com.rystars.mall.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rystars
 * @date 2023/4/3
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world!";
    }

}
