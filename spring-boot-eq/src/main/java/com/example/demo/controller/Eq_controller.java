package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Eq_controller {

	@RequestMapping("/eq")
	public String eq(ModelMap map) {
		map.addAttribute("name", "わたる");
		map.addAttribute("age", 20);
		map.addAttribute("flag", "yes");
		return "eq";
	}
}
