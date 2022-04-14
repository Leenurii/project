package com.room.main.dto;

import lombok.Data;

@Data
public class BookDTO {
	
	public int getBook_bno() {
		return book_bno;
	}
	public void setBook_bno(int book_bno) {
		this.book_bno = book_bno;
	}
	public String getBook_order() {
		return book_order;
	}
	public void setBook_order(String book_order) {
		this.book_order = book_order;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_bname() {
		return m_bname;
	}
	public void setM_bname(String m_bname) {
		this.m_bname = m_bname;
	}
	public int getBook_people() {
		return book_people;
	}
	public void setBook_people(int book_people) {
		this.book_people = book_people;
	}
	public String getBook_tel() {
		return book_tel;
	}
	public void setBook_tel(String book_tel) {
		this.book_tel = book_tel;
	}
	public String getBook_ok() {
		return book_ok;
	}
	public void setBook_ok(String book_ok) {
		this.book_ok = book_ok;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public int getR_bno() {
		return r_bno;
	}
	public void setR_bno(int r_bno) {
		this.r_bno = r_bno;
	}
	public String getRoom_class() {
		return room_class;
	}
	public void setRoom_class(String room_class) {
		this.room_class = room_class;
	}
	public String getR_name() {
		return r_name;
	}
	public void setR_name(String r_name) {
		this.r_name = r_name;
	}
	public int getR_kind() {
		return r_kind;
	}
	public void setR_kind(int r_kind) {
		this.r_kind = r_kind;
	}
	public String getR_rent() {
		return r_rent;
	}
	public void setR_rent(String r_rent) {
		this.r_rent = r_rent;
	}
	public String getR_fnc() {
		return r_fnc;
	}
	public void setR_fnc(String r_fnc) {
		this.r_fnc = r_fnc;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public int getR_price() {
		return r_price;
	}
	public void setR_price(int r_price) {
		this.r_price = r_price;
	}
	private int	 	book_bno;
	private String 	book_order;		// 예약번호
	private String 	m_name;			// 예약자 이름
	private String	m_bname;			// 비회원 이름
	private int	 	book_people;	// 예약 인원
	private String 	book_tel;		// 예약자 전화번호
	private String 	book_ok;		// 예약 상태(입금여부-가예약,예약완료,입실,퇴실)
	private String 	start_date;		// 예약시작일자
	private String 	end_date;		// 예약종료일자
	private int		r_bno;			// 방 번호
	private String 	room_class;
	private String 	r_name;
	private int		r_kind;
	private String 	r_rent;
	private String	r_fnc;
	private String 	payment;
	private int		r_price;
}
