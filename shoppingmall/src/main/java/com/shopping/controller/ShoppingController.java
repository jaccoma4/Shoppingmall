package com.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.shopping.service.ShoppingService;

@Controller
public class ShoppingController {
	
	@Autowired
	ShoppingService shoppingService;
	
	@GetMapping("shopping/list")
	public String list() {
		return "list";
	}
}
