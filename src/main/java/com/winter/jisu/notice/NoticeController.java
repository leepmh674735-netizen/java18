package com.winter.jisu.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NoticeController {
	
	@Autowired
	private NoticeService jisu;
	
	
	@GetMapping("/notice/list")
	public String list(Model model) { 
	List<NoticeDTO> ar = jisu.list();
			
	model.addAttribute("update", ar);
	
		
		return "notice/list";
		
	}
	@GetMapping("/notice/detail")
    public void detail(NoticeDTO yellow, Model model) {
    	NoticeDTO apple=jisu.detail(yellow);
    	
    	model.addAttribute("fresh", apple);
     	
    }
}
