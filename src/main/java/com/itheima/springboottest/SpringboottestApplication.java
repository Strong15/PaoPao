package com.itheima.springboottest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringboottestApplication {

	@Value("${cupSize}")
	private String cupSize;

	public static void main(String[] args) {
		SpringApplication.run(SpringboottestApplication.class, args);
		System.out.println("你好");
		System.out.println("你好2");
	}
}
