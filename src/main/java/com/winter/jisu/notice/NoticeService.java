package com.winter.jisu.notice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeMapper yellow;
	
  	
	
 public List<NoticeDTO> list() {
	List<NoticeDTO> list = yellow.yellow();
   
	 
	
   return list;
 }
 
 
}  
