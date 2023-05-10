package com.tyza66.controller;

import com.tyza66.service.TempService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: tyza66
 * Date: 2023/05/10 12:20
 * Github: https://github.com/tyza66
 **/
@RestController
public class Service2 {
    @DubboReference(check = false)
    TempService tempService;
    @RequestMapping("/b")
    public String world(){
        String hello = tempService.hello();
        return hello+"world";
    }
}
