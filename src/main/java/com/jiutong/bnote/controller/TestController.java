package com.jiutong.bnote.controller;

import com.jiutong.bnote.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by  on 16/4/3.
 */
@RestController
@Controller
public class TestController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/test")
    public String test(String name){
        return demoService.sayHello(name);
    }
}
