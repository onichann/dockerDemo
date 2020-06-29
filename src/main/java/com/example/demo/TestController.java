package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2020-06-18 下午 5:27
 * introduction
 */
@RestController
public class TestController {

    @RequestMapping("/demo")
    public String demo() {
        return "hello world" + System.currentTimeMillis();
    }
}
