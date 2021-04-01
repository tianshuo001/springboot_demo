package com.jj;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @ClassName SpringbootTest
 * @Description TODO
 * @Author tianshuo
 * @Date 2021/3/16 18:13
 * @Version 1.0
 **/

@SpringBootTest
public class SpringbootTest {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {
        // 查看一下默认的数据源
        System.out.println(dataSource.getClass());
        System.out.println("==========");
        // 获得连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

        // 归还连接
        connection.close();
    }
}
