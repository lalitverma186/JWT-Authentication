package com.ignou.project.JWTAuthentication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello World";
	}

}