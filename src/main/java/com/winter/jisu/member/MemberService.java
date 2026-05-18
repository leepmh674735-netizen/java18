package com.winter.jisu.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	private MemberMapper memberMapper;
	
	public MemberDTO loginCheck(String id, String pw) {
		
		MemberDTO user = memberMapper.login(id);
		
		if(user != null && user.getPw().equals(pw)) {
			return user;
		}
		return null;
	}

}
