package com.codegnan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class UserControllers {

	@GetMapping
	public String Hello() {
		return "HelloWorld";
		
		
		
		
		
		
	}
}
