package com.xj.interfacesup.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test")
public class testController {
    @RequestMapping(value="/say",method = RequestMethod.GET)
    public String test(){
        return "hello,didi!";
    }
}
