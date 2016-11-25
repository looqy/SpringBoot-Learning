package com.looqy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

public class TestClientController {
	
	@Value("${morning}")
    private String morning;
	
    @RequestMapping("/getMorning")
    public String getMorning() {
        return this.morning;
    }
}
