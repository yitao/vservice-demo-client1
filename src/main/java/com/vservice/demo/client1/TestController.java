package com.vservice.demo.client1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 系统心跳
 * Created by yitao on 2019/1/24.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ApiService apiService;

    @RequestMapping("/registerUser")
    public String registerUser(String name, int age) {
        Map<String, Object> params = new HashMap<>();
        params.put("name", name);
        params.put("age", age);
        return apiService.registerUser(params);
    }

}
