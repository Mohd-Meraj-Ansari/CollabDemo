package com.app.Test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/test")
	public String test() {
		return "test endpoint";
	}

	@GetMapping("/health")
	public String health() {
		return "health endpoint";
	}
}
