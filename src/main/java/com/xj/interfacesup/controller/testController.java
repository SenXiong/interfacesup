package com.xj.interfacesup.controller;

import com.xj.interfacesup.Bean.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(value = "测试Api")
@RestController
@RequestMapping(value="/test")
public class testController {

    @ApiOperation(value = "get方法，返回常量",notes = "get测试方法")
    @GetMapping(value="/getTest")
    public String getTest(){
        return "hello,臭弟弟!";
    }

    @ApiOperation(value = "post方法，返回实体类",notes = "post测试方法" )
    @PostMapping(value="/postTest")
    public Person postTest(@RequestBody Person person){
        return person;
    }

}
