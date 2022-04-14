package com.room.member.dto;

import java.util.Date;

import lombok.Data;

@Data
public class ReplyDTO {
	private int rep_bno;
	private String rep_content;
	private String m_id;
	private Date   rep_date;
	public int getRep_bno() {
		return rep_bno;
	}
	public void setRep_bno(int rep_bno) {
		this.rep_bno = rep_bno;
	}
	public String getRep_content() {
		return rep_content;
	}
	public void setRep_content(String rep_content) {
		this.rep_content = rep_content;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public Date getRep_date() {
		return rep_date;
	}
	public void setRep_date(Date rep_date) {
		this.rep_date = rep_date;
	}
	public int getQna_bno() {
		return qna_bno;
	}
	public void setQna_bno(int qna_bno) {
		this.qna_bno = qna_bno;
	}
	public int getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		this.answer = answer;
	}
	private int qna_bno;
	private int answer;
	
}
