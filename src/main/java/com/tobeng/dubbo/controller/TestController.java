package com.tobeng.dubbo.controller;

import com.tobeng.dubbo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 测试接口
 *
 * @author yaorui
 * @date 2019-10-09 11:29
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping("/{id}")
    public String getMessage(@PathVariable("id") String id){
        return testService.getMessage(id);
    }

}
