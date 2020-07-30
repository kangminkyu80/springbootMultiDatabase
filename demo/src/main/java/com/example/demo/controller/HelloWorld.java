package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@GetMapping("/hello")
	public String root_test() throws Exception {
		return "Hello World";
	}
	
	@GetMapping("/demo")
	public String demo_test() throws Exception {
		return "데모 페이지에 접속 하셨습니다.";
	}

}
