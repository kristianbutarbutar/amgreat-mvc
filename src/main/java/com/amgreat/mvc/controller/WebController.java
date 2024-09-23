package com.amgreat.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	@RequestMapping("/verify")
	public String verifyCommand(){
		return "command:verify";
	}
}
