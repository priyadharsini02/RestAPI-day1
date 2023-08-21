package com.day1a.day1a.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController_Ex_3 {
@GetMapping("favcolor")
public String getMyFav(@RequestParam String color) {
	return "My Favourite Colour is "+color;
}
}
