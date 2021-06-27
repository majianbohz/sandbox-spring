package com.yinyu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.yinyu.mapper")
public class ShardjdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShardjdbcApplication.class, args);
	}

}
