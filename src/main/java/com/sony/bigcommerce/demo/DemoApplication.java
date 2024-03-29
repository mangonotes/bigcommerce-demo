package com.sony.bigcommerce.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.sony.bigcommerce.demo")
@MapperScan("com.sony.bigcommerce.demo.dao.mappers")

public class DemoApplication  {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	

	

}
