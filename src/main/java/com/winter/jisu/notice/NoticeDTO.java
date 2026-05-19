package com.winter.jisu.notice;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoticeDTO {
	
	private Long boardNum;     //게시글 글번호
	private String boardTitle;  //게시글 제목
	private String boardwriter;  //게시글 작성자
	private String boardContent;  //게시글 내용
	private LocalDateTime boardDate;  //게시글 작성된 날짜와 시간
	private Long boardHit;           //게시글 조회수

}
