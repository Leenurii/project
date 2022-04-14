package com.room.member.dto;

import java.util.Date;

import lombok.Data;
@Data
public class QnaDTO {

	private int qna_bno;
	private int qna_seceret;
	private String qna_title;
	private String qna_content;
	private Date  qna_date;
	private String m_id;
	private String qna_class;
	
	public int getQna_bno() {
		return qna_bno;
	}
	public void setQna_bno(int qna_bno) {
		this.qna_bno = qna_bno;
	}
	public int getQna_seceret() {
		return qna_seceret;
	}
	public void setQna_seceret(int qna_seceret) {
		this.qna_seceret = qna_seceret;
	}
	public String getQna_title() {
		return qna_title;
	}
	public void setQna_title(String qna_title) {
		this.qna_title = qna_title;
	}
	public String getQna_content() {
		return qna_content;
	}
	public void setQna_content(String qna_content) {
		this.qna_content = qna_content;
	}
	public Date getQna_date() {
		return qna_date;
	}
	public void setQna_date(Date qna_date) {
		this.qna_date = qna_date;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getQna_class() {
		return qna_class;
	}
	public void setQna_class(String qna_class) {
		this.qna_class = qna_class;
	}
	
}
