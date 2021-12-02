package com.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.shopping.service.ShoppingService;

@Controller
public class ShoppingController {
	
	
	@GetMapping("shopping/list")
	public String list() {
		return "list";
	}
	
	
	@PostMapping("test")
	public String test() {
		return "test";
	}
}
