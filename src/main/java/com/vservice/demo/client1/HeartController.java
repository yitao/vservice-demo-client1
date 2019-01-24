package com.vservice.demo.client1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 系统心跳
 * Created by yitao on 2019/1/24.
 */
@RestController
@RequestMapping("/heart")
public class HeartController {

    @RequestMapping("/alive")
    public String alive() {
        return "alive";
    }

}
