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

	@GetMapping("/admin")
	public String showAdmin() {
		return "Adminpage";
	}

	@GetMapping("/teacher")
	public String showTeacher() {
		return "Teacherpage";
	}

	@GetMapping("/management")
	public String showManagement() {
		return "Managementpage";
	}

	@GetMapping("/emp")
	public String showEmp() {
		return "Emppage";
	}

	@GetMapping("/denied")
	public String showDenied() {
		return "Deniedpage";
	}
}
