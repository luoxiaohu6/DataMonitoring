package com.shiyanshi.dashuju;


import com.shiyanshi.dashuju.config.WebSocketServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.shiyanshi.dashuju.Mapper")
public class DashujuApplication {

    public static void main(String[] args) {
        SpringApplication.run(DashujuApplication.class, args);
    }

}
