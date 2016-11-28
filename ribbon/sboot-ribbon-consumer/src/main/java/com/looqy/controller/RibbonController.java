package com.looqy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class RibbonController {
	
	@Autowired
	RestTemplate template;
	
	@RequestMapping(value="/add", method= RequestMethod.GET)
	public String add(){
		return template.getForEntity("http://CLIENT-SERVICE/add?a=2009&b=409", String.class).getBody();
	}
}
