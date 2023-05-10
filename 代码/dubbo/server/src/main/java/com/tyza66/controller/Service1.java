package com.tyza66.controller;

import com.tyza66.service.TempService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: tyza66
 * Date: 2023/05/10 12:10
 * Github: https://github.com/tyza66
 **/
@RestController
@DubboService
public class Service1 implements TempService{
    @RequestMapping("/a")
    public String hello(){
        return "Hello,";
    }
}
