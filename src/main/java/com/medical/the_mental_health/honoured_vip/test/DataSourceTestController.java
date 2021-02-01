package com.medical.the_mental_health.honoured_vip.test;

import com.medical.the_mental_health.commen.page.Result;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * @author LocalUserZzy
 */
@RestController
@RequestMapping("test")
public class DataSourceTestController {

    private final DataSource dataSource;

    public DataSourceTestController(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * {@link SneakyThrows}:这个注解是Lombok提供的,加入此注解后可以不需要显式的抛出异常
     */
    @GetMapping("/dataSource")
    @SneakyThrows
    public Result test() {
        System.out.println(dataSource);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        System.out.println(dataSource);
        return new Result(true, "测试接口,查看dataSourcePoll是否配置成功",dataSource.toString());
    }
}
