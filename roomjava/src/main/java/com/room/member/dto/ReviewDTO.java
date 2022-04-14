package com.room.member.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReviewDTO {

	private int 	review_bno;		//번호
	private	int 	 r_bno;		//제목
	private String  r_name;	//답변
	public int getReview_bno() {
		return review_bno;
	}
	public void setReview_bno(int review_bno) {
		this.review_bno = review_bno;
	}
	public int getR_bno() {
		return r_bno;
	}
	public void setR_bno(int r_bno) {
		this.r_bno = r_bno;
	}
	public String getR_name() {
		return r_name;
	}
	public void setR_name(String r_name) {
		this.r_name = r_name;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getReview_star() {
		return review_star;
	}
	public void setReview_star(String review_star) {
		this.review_star = review_star;
	}
	public Date getM_reg() {
		return m_reg;
	}
	public void setM_reg(Date m_reg) {
		this.m_reg = m_reg;
	}
	public int getR_kind() {
		return r_kind;
	}
	public void setR_kind(int r_kind) {
		this.r_kind = r_kind;
	}
	public String getR_content() {
		return r_content;
	}
	public void setR_content(String r_content) {
		this.r_content = r_content;
	}
	public String getBook_order() {
		return book_order;
	}
	public void setBook_order(String book_order) {
		this.book_order = book_order;
	}
	private	String	m_id;	//질문목록//질문목록
	private	String	review_star;	//질문목록
	private	Date	m_reg;	//질문목록
	private	int	r_kind;	//질문목록
	private	String	r_content;	//질문목록
	private String	book_order;
		
}
