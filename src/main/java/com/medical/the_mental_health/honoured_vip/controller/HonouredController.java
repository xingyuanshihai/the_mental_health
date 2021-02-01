package com.medical.the_mental_health.honoured_vip.controller;

import com.medical.the_mental_health.commen.page.Result;
import com.medical.the_mental_health.entity.TMember;
import com.medical.the_mental_health.honoured_vip.service.HonouredService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author LocalUserZzy
 */
@RestController
@RequestMapping("honoured")
//@CrossOrigin
public class HonouredController {

    private final HonouredService honouredService;

    public HonouredController(HonouredService honouredService) {
        this.honouredService = honouredService;
    }

    @GetMapping("list")
    public Result list() {
        List<TMember> results = honouredService.list();
        return new Result(true, "测试接口,查看dataSourcePoll是否配置成功",results);
    }

    @PostMapping("save")
    public Result save(@RequestBody TMember member) {
        Integer rowInteger = honouredService.saveHonoured(member);
        return new Result(true, "成功添加"+rowInteger+"个会员!",member.getId());
    }

    @DeleteMapping("del/{id}")
    public Result del(@PathVariable("id") Integer id) {
        System.out.println(id);
        return new Result(true, "测试接口!");
        /*Integer rowInteger = honouredService.delHonoured(id);
        return new Result(true, "成功添加"+rowInteger+"个会员!");*/
    }
}
