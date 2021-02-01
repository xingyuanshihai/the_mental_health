package com.medical.the_mental_health.honoured_vip.test;

import com.medical.the_mental_health.commen.page.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

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

    @GetMapping("/dataSource")
    public Result test() throws SQLException {
        System.out.println(dataSource);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        System.out.println(dataSource);
        return new Result(true, "测试接口,查看dataSourcePoll是否配置成功",dataSource.toString());
    }
}
