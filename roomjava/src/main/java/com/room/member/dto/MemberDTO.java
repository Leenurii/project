package com.room.member.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class MemberDTO {
	private	String	m_bno;			// 회원 번호
	private	String	m_id;			// 회원 아이디
	private	String	m_pwd;	// 회원 비민번호
	private	String	m_name;		// 회원 이름
	private	String	m_tel;		// 회원 전화번호
	private	String	m_email;		// 회원 이메일
	private	String	m_address;	// 회원 주소
	private	String	m_birth;		// 회원 생년월일
	public String getM_bno() {
		return m_bno;
	}
	public void setM_bno(String m_bno) {
		this.m_bno = m_bno;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_pwd() {
		return m_pwd;
	}
	public void setM_pwd(String m_pwd) {
		this.m_pwd = m_pwd;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_tel() {
		return m_tel;
	}
	public void setM_tel(String m_tel) {
		this.m_tel = m_tel;
	}
	public String getM_email() {
		return m_email;
	}
	public void setM_email(String m_email) {
		this.m_email = m_email;
	}
	public String getM_address() {
		return m_address;
	}
	public void setM_address(String m_address) {
		this.m_address = m_address;
	}
	public String getM_birth() {
		return m_birth;
	}
	public void setM_birth(String m_birth) {
		this.m_birth = m_birth;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public int getM_power() {
		return m_power;
	}
	public void setM_power(int m_power) {
		this.m_power = m_power;
	}
	private	Date	reg_date;	// 회원 생성날짜
	private int		m_power;	// 회원 권한

}
