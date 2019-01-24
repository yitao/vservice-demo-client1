package com.vservice.demo.client1;

import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by yitao on 2019/1/24.
 */
@Service
public class ApiServiceHystrix implements ApiService{

    @Override
    public String registerUser(Map<String, Object> params) {
        return "fail";
    }
}
