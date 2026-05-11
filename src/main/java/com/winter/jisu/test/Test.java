package com.winter.jisu.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test {
	
	@GetMapping("/test/add")
	public String add() {
		
		return "test/add";
	}
	@GetMapping("/test/detail")
	public String detail() {
		
		return "test/detail";
	}
	@GetMapping("/test/list")
	public String list() {
		
		return "test/list";
	}
}	
