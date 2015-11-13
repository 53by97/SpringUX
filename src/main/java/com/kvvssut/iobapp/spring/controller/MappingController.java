package com.kvvssut.iobapp.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MappingController {

	@RequestMapping("/allnotes")
	public String hello() {
		return "allnotes";
	}

}