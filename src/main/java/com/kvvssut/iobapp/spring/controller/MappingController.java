package com.kvvssut.iobapp.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MappingController {

	@RequestMapping("/services")
	public String hello() {
		return "services";
	}

}