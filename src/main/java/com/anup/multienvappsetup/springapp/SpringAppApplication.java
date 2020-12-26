package com.anup.multienvappsetup.springapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAppApplication {

	@Value("${server.port}")
	private static String port;
	public static void main(String[] args) {
		System.out.println(port);
		SpringApplication.run(SpringAppApplication.class, args);
	}

}
