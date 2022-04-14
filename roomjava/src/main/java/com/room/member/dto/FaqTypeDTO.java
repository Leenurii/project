package com.room.member.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class FaqTypeDTO {

	public String getFaq_class() {
		return faq_class;
	}
	public void setFaq_class(String faq_class) {
		this.faq_class = faq_class;
	}
	public String getFaq_name() {
		return faq_name;
	}
	public void setFaq_name(String faq_name) {
		this.faq_name = faq_name;
	}
	private String 	faq_class; // 질문종류번호
	private String	faq_name; 		// 질문종류
}
