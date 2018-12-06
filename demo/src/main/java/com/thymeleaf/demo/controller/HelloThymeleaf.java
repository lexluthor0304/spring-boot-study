package com.thymeleaf.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@Controller
public class HelloThymeleaf {
    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("message", "https://tokugai.com");
        return "hello";
    }
}
