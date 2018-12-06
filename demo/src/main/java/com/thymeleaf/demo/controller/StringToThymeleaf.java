package com.thymeleaf.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StringToThymeleaf {
    @RequestMapping("/string")
    public String string(ModelMap map) {
        map.addAttribute("userName", "わたる");
        return "string";
    }
}
