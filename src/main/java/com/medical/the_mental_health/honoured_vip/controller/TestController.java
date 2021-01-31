package com.medical.the_mental_health.honoured_vip.controller;

import com.medical.the_mental_health.commen.page.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LocalUserZzy
 */
@Controller
@RequestMapping("vip")
public class TestController {

    @GetMapping("/")
    public Result test1() {
        return new Result(true, "查询会员列表成功",new String("你好"));
    }
}
