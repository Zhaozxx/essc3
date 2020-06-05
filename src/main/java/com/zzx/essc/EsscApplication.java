package com.zzx.essc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zzx.crm.mapper")
public class EsscApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsscApplication.class, args);
    }

}
