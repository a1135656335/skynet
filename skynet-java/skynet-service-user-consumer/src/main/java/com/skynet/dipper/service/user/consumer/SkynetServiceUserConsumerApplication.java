package com.skynet.dipper.service.user.consumer;



import org.apache.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;




@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication(scanBasePackages = "com.skynet.dipper", exclude = {DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class})
public class SkynetServiceUserConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SkynetServiceUserConsumerApplication.class, args);
        Main.main(args);
    }
}
