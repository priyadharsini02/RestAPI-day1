package com.day1a.day1a.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController_Ex_2 {
	@GetMapping("getName")
	public String getName(@RequestParam String name) {
		return "Welcome "+name+"!";
	}
}
