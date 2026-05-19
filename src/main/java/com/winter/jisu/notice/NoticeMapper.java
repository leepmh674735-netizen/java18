package com.winter.jisu.notice;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoticeMapper {
	
	public NoticeDTO detail(NoticeDTO notieDTO);
	
	public int happen(NoticeDTO noticeDTO);
	
	

	public List<NoticeDTO> yellow(); 
	  
	
}


	
	


