package com.medical.the_mental_health.honoured_vip.service.impl;

import com.medical.the_mental_health.honoured_vip.mapper.TestMapper;
import com.medical.the_mental_health.honoured_vip.service.TestService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Service;

/**
 * @author LocalUserZzy
 */
@Service
public class TestServiceImpl implements TestService {

    @Reference
    private TestMapper testMapper;

}
