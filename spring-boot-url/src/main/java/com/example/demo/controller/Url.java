package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Url {

	@RequestMapping("/url")
	public String url(ModelMap map) {
		map.addAttribute("type", "link");
		map.addAttribute("pageId", "springcloud/2017/09/11");
		map.addAttribute("img", "http://www.ityouknow.com/assets/images/neo.jpg");
		return "url";
	}
}
