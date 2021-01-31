package com.medical.the_mental_health.system.controller;

import com.wf.captcha.SpecCaptcha;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName:LoginController
 * Package:com.medical.the_mental_health.system
 * Description:
 *
 * @date:2021/1/31 23:08
 * @author:1751363092@qq.com
 */
@RestController
@RequestMapping("system")
public class LoginController {


    //生成 验证码
    @RequestMapping("captcha")
    public void captcha(HttpServletResponse response) throws IOException {

        SpecCaptcha captcha = new SpecCaptcha(130, 48);
        String text = captcha.text();
        char[] chars = captcha.textChar();
        System.out.println("验证码："+text);
        System.out.println(chars);
            // 输出验证码
        captcha.out(response.getOutputStream());
    }




}
