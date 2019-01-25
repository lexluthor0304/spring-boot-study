package com.thymeleaf.object.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Object {

	@RequestMapping("/object")
	public String object(HttpServletRequest request) {
		request.setAttribute("request", "リクエストです");
		request.getSession().setAttribute("session", "セッションです");
		return "object";
	}
}
