package com.medical.the_mental_health.honoured_vip.service.impl;

import com.medical.the_mental_health.entity.TMember;
import com.medical.the_mental_health.honoured_vip.mapper.HonouredMapper;
import com.medical.the_mental_health.honoured_vip.service.HonouredService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LocalUserZzy
 */
@Service
public class HonouredServiceImpl implements HonouredService {

    @Resource
    private HonouredMapper honouredMapper;

    @Override
    public Integer delete(Integer id) {
        return honouredMapper.delete(id);
    }

    @Override
    public void update(TMember member) {
        honouredMapper.update(member);
    }

    @Override
    public Integer save(TMember member) {
        return honouredMapper.save(member);
    }

    @Override
    public List<TMember> list() {
        return honouredMapper.list();
    }


}
