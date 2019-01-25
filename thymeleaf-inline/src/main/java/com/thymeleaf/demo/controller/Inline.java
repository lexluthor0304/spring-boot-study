package com.thymeleaf.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Inline {

	@RequestMapping("/inline")
	public String inline(ModelMap map){
		map.addAttribute("userName", "わたる");
		return "inline";
	}
}
