package com.sri.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/hi")
	public String hello(Model model) {
		
		model.addAttribute("name", "Sri Ram Ede");
		
		return "welcome";
	}
	
}
