package com.xj.interfacesup.controller;

import com.alibaba.druid.filter.config.ConfigTools;
import com.xj.interfacesup.bean.User;
import com.xj.interfacesup.server.TestServer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
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
    public User postTest(@RequestBody Long id) {
        return testServer.select(id);
    }

    public static void main(String[] args) {
        try {
            String password = "123";
            String[] arr = ConfigTools.genKeyPair(512);

            // System.out.println("privateKey:" + arr[0]);
            System.out.println("publicKey:" + arr[1]);
            System.out.println("password:" + ConfigTools.encrypt(arr[0], password));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
