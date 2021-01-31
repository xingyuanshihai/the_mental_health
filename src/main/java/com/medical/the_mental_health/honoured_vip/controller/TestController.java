package com.medical.the_mental_health.honoured_vip.controller;

import com.medical.the_mental_health.commen.page.Result;
import com.medical.the_mental_health.honoured_vip.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

/**
 * @author LocalUserZzy
 */
@RestController
@RequestMapping("vip")
@CrossOrigin
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("list")
    public Result test() throws SQLException {

        return new Result(true, "测试接口,查看dataSourcePoll是否配置成功",new String("str"));
    }
}
