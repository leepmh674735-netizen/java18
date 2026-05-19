package com.winter.jisu.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	@GetMapping("notice/create")
	public void create() {
		
	
	
	}
	@PostMapping("notice/create")
	public String create(NoticeDTO happen ) {
		int a = jisu.create(happen);
		
		return "redirect:./list";
		
	}
}
