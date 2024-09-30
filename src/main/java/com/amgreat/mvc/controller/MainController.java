package com.amgreat.mvc.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amgreat.mvc.services.DataServices;

import java.util.Map;

@Controller
public class MainController {

	@Autowired private DataServices integratorAPI;
	
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Map<String, Object> model) {
		model.put("message", this.message);
		return "home";
	}

	@RequestMapping(value = "/erp", method = RequestMethod.GET)
	public String erp() {
		return "console";
	}
	
	@RequestMapping(value = "/amgreat/portal/{pageId}", method = RequestMethod.GET)
	public String uri( Map<String, Object> model, @PathVariable String pageId ) {
		model.put("__content", pageId);
		return "s"+pageId;
	}
}
