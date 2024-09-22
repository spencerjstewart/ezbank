package com.spencerstewart.ezbank.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountControllers {

	@GetMapping("sayHello")
	public String sayHello() {

		return "hi World";
	}
}
