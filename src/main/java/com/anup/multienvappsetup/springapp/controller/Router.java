package com.anup.multienvappsetup.springapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="/api/v1/core/")
@RestController
public class Router {

	@Value("${server.port}")
	private String port;
	
	@Value("${name}")
	private String name;
	
	@GetMapping(value="user")
	public String message() {
		System.out.println("PORT "+port +" --- "+name);
		return port;
	}
	
}
