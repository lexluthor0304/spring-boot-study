package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Switch {

	@RequestMapping("/switch")
	public String switchcase(ModelMap map){
		map.addAttribute("sex", "woman");
		return "switch";
	}
}
