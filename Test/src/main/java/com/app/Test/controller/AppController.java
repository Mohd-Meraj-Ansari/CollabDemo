package com.app.Test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/test")
	public String test() {
		return "test endpoint";
	}
	
	@GetMapping("/test-2")
	public String testTwo() {
		return "test two endpoint";
	}
	
	@GetMapping("/test-3")
	public String testThree() {
		return "test three endpoint";
	}
}
