package com.vservice.demo.client1;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by yitao on 2019/1/24.
 */
@FeignClient(value = "vservice-demo-api1/vservice-demo-api1" , fallback = ApiServiceHystrix.class)
public interface ApiService {

    @RequestMapping("/api/registerUser")
    String registerUser(Map<String,Object> params);

}
