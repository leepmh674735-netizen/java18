package com.winter.jisu.member;

import java.security.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDTO {
	
	private String id;
	private String pw;
	private String name;
	private String email;
	private Timestamp reData;
	
}