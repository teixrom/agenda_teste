package br.com.santander.agenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HeloController {

	@RequestMapping("/")
	@ResponseBody
	public String Hello() {
		
		return "Boa!!!!";
	}
	
}
