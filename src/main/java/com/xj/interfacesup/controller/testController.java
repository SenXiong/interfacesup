package com.xj.interfacesup.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "测试Api")
@RestController
@RequestMapping(value="/test")
public class testController {

    @ApiOperation(value = "get方法，返回常量",notes = "测试方法")
    @RequestMapping(value="/say",method = RequestMethod.GET)
    public String test(){
        return "hello,臭弟弟!";
    }

}
