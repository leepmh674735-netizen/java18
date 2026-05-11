package com.winter.jisu.notice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NoticeController {
	@GetMapping("/notice/list")
	public String list() { 
		
		return "notice/list";
		
	}
    @GetMapping("/notice/detail")
	public String detail() {
  
		
		return "notice/detail";
		
	}
	public void update() {
		
	}
	public void delete() {
		
	}
	@GetMapping("notice/add")
	public String add() {
		
		return "notice/add";
	}
}
