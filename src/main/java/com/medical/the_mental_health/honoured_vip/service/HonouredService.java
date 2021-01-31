package com.medical.the_mental_health.honoured_vip.service;

import com.medical.the_mental_health.entity.TMember;

import java.util.List;

/**
 * @author LocalUserZzy
 */
public interface HonouredService {

    /**
     * 查询所有的会员信息
     * @return 所有会员信息
     */
    List<TMember> list();

    /**
     * 添加会员
     * @param member 会员信息对象
     * @return 添加了几个会员
     */
    Integer saveHonoured(TMember member);

    /**
     * 按照ID编号删除会员
     * @param id 要删除会员的ID编号
     * @return 删除了几个会员
     */
    Integer delHonoured(Integer id);
}
