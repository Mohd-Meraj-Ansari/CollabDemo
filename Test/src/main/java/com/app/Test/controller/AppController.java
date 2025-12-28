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

	/*
	* This endpoint is to get the health of collab-demo microservice
	* hahahahahahahah
	**/
	@GetMapping("/health")
	public String health() {
		return "health endpoint";
	}
}
