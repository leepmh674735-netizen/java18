package com.winter.jisu.notice;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoticeDTO {
	
	private Long boardNum;
	private String boardTitle;
	private String boardwriter;
	private String boardContent;
	private LocalDateTime boardDate;
	private Long boardHit;

}
