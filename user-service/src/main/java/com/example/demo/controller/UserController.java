package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by hanll on 2019/7/17.
 */
@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/test")
    public String test(){
        String jsonResult = restTemplate.getForEntity("http://feign:9000/restTest", String.class).getBody();
        return jsonResult;
    }
}
