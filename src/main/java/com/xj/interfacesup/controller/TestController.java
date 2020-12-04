package com.xj.interfacesup.controller;

import com.xj.interfacesup.Bean.Person;
import com.xj.interfacesup.server.TestServer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@Api(value = "测试Api")
@RestController
@RequestMapping(value="/test")
public class TestController {
    @Autowired
    private TestServer testServer;

    @ApiOperation(value = "get方法，返回常量",notes = "get测试方法")
    @GetMapping(value="/getTest")
    public String getTest(){
        return "hello,臭弟弟!";
    }

    @ApiOperation(value = "post方法，返回实体类",notes = "post测试方法" )
    @PostMapping(value="/postTest")
    public Person postTest(@RequestBody Person person){
        person.setAge(testServer.add(person.getAge()));
        person.setName(person.getName().concat("A"));
        return person;
    }

}
