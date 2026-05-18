package com.winter.jisu.member;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
	
	public int join(MemberDTO memberDTO);
	
	public MemberDTO login(String id);
	
	public int update(MemberDTO memberDTO);

}
