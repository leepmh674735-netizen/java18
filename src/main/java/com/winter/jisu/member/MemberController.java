package com.winter.jisu.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService red;
	
	@GetMapping("/member/join")
	public String join(Module model) {
		
		
		return "users/join";
		
	}
	@GetMapping("/member/login")
	public String login() {
	
	  return "users/login";

  }
  public void update() {
	
	
  }
  public void delete() {

  }
  @GetMapping("/member/mypage")
  public String mypage() {
	
	return "member/mypage";
  }

}
