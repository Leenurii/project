package com.room.admin.dto;

import java.sql.Timestamp;


import lombok.Data;

@Data
public class BoardDTO {

	public int getNotice_bno() {
		return notice_bno;
	}
	public void setNotice_bno(int notice_bno) {
		this.notice_bno = notice_bno;
	}
	public String getNotice_title() {
		return notice_title;
	}
	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}
	public String getNotice_content() {
		return notice_content;
	}
	public void setNotice_content(String notice_content) {
		this.notice_content = notice_content;
	}
	public Timestamp getNotice_date() {
		return notice_date;
	}
	public void setNotice_date(Timestamp notice_date) {
		this.notice_date = notice_date;
	}
	private int notice_bno;
	private String notice_title;
	private String notice_content;
	private Timestamp notice_date;
}
