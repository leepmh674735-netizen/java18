package com.winter.jisu.member;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {	
	
	public MemberDTO login(MemberDTO memberDTO);
	
	public int consider(MemberDTO memberDTO);
	
	public List<MemberDTO> birth();
	
	
}
