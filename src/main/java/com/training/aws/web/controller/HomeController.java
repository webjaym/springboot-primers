package com.training.aws.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "/index")
	public String index()
	{
		return "index";
	}
	
}
