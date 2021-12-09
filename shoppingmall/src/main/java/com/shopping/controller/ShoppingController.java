package com.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.shopping.service.ShoppingService;

@Controller
public class ShoppingController {
	
	@GetMapping("mainToolbar")
	public String mainToolbar() {
		return "MainTopToolbar";
	}
	
	@GetMapping("main")
	public String main() {
		return "main";
	}
	
	@GetMapping("productList")
	public String productList() {
		return "productList";
	}
	
	@GetMapping("productDetail")
	public String productDetail() {
		return "productDetail";
	}
	
	@GetMapping("order")
	public String order() {
		return "order";
	}
	
	
	@GetMapping("orderResult")
	public String orderResult() {
		return "orderResult";
	}
	
	@GetMapping("cart")
	public String cart(){
		return "cart";
	}
	
	@GetMapping("useradd")
	public String useradd() {
		return "useradd";
	}
	
	@GetMapping("userResult")
	public String result() {
		return "userResult";
	}
	
	@GetMapping("userLogin")
	public String userLogin() {
		return "userLogin";
	}
	
	
	@GetMapping("findId")
	public String findId() {
		return "findId";
	}
	
	@GetMapping("findIdResult")
	public String findIdResult() {
		return "findIdResult";
	}
	
	@GetMapping("findPassword")
	public String findPassword() {
		return "findPassword";
	}
	
	@GetMapping("findPasswordResult")
	public String findPasswordResult() {
		return "findPasswordResult";
	}
	
	@GetMapping("orderCheck")
	public String orderCheck() {
		return "orderCheck";
	}
	
	@GetMapping("userUpdate")
	public String userUpdate() {
		return "userUpdate";
	}
	
	@GetMapping("review")
	public String review() {
		return "review";
	}
	@GetMapping("InquiryList")
	public String InquiryList() {
		return "InquiryList";
	}
	
	@GetMapping("Inquiry")
	public String Inquiry() {
		return "Inquiry";
	}
	
	@GetMapping("InquiryResult")
	public String InquiryResult() {
		return "InquiryResult";
	}
	
}
