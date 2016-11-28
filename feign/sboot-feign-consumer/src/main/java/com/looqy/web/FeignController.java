package com.looqy.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.looqy.service.ClientService;

@RestController
public class FeignController {
	
	@Autowired
	ClientService client;
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public Integer add(){
		return client.add(2009, 409);
	}
}
