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
    public Integer delHonoured(Integer id) {
        return honouredMapper.delHonoured(id);
    }

    @Override
    public Integer saveHonoured(TMember member) {
        return honouredMapper.saveHonoured(member);
    }

    @Override
    public List<TMember> list() {
        return honouredMapper.list();
    }


}
