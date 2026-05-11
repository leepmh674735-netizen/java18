package com.winter.jisu.board.qua;

import java.util.concurrent.Flow.Publisher;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QnaController {
	
	@GetMapping("/board/add")
	public String add() {
		 
		return "board/add";
	}
	@GetMapping("/board/detail")
	 public String detail() {
		 
		 return "board/detail";
		 
	 }
	@GetMapping("/board/list")
	  public String list() {
		  
		  return "board/list";
	  }
		


}
