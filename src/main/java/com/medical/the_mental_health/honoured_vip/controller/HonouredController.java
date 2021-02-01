package com.medical.the_mental_health.honoured_vip.controller;

import com.medical.the_mental_health.commen.page.Result;
import com.medical.the_mental_health.entity.TMember;
import com.medical.the_mental_health.honoured_vip.service.HonouredService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author LocalUserZzy
 */
@RestController
@RequestMapping("honoured")
@Slf4j
public class HonouredController {

    private final HonouredService honouredService;

    public HonouredController(HonouredService honouredService) {
        this.honouredService = honouredService;
    }

    @GetMapping("")
    public Result list() {
        List<TMember> results = honouredService.list();
        log.info("所有会员信息:{}",results);
        return new Result(true, "测试接口,查看dataSourcePoll是否配置成功",results);
    }

    @PostMapping("")
    public Result save(@RequestBody TMember member) {
        log.info("会员信息:{}",member);
        return new Result(true, "测试接口!");
        /*Integer rowInteger = honouredService.save(member);
        return new Result(true, "成功添加"+rowInteger+"个会员!",member.getId());*/
    }

    @PutMapping("")
    public Result update(@RequestBody TMember member) {
        log.info("会员修改后信息:{}",member);
        return new Result(true, "测试接口!");
        /*honouredService.update(member);
        return new Result(true, "成功添加"+rowInteger+"个会员!",member.getId());*/
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") Integer id) {
        log.info("要删除的会员ID编号:{}",id);
        return new Result(true, "测试接口!");
        /*Integer rowInteger = honouredService.delete(id);
        return new Result(true, "成功添加"+rowInteger+"个会员!");*/
    }
}
