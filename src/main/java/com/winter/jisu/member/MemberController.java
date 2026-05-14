package com.winter.jisu.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	@GetMapping("/member/join")
	public String join() {
		
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
