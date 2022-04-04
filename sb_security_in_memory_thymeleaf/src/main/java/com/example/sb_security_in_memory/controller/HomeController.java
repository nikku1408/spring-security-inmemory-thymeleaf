package com.example.sb_security_in_memory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String showHome() {
		return "Homepage";
	}

	@GetMapping("/welcome")
	public String showWelcome() {
		return "Welcomepage";
	}
}
