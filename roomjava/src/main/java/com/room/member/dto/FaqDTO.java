package com.room.member.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FaqDTO {

	private int 	faq_bno;		//번호
	private	String  faq_title;		//제목
	private String  faq_content;	//답변
	public int getFaq_bno() {
		return faq_bno;
	}
	public void setFaq_bno(int faq_bno) {
		this.faq_bno = faq_bno;
	}
	public String getFaq_title() {
		return faq_title;
	}
	public void setFaq_title(String faq_title) {
		this.faq_title = faq_title;
	}
	public String getFaq_content() {
		return faq_content;
	}
	public void setFaq_content(String faq_content) {
		this.faq_content = faq_content;
	}
	public String getFaq_class() {
		return faq_class;
	}
	public void setFaq_class(String faq_class) {
		this.faq_class = faq_class;
	}
	private	String	faq_class;	//질문목록
	
}
