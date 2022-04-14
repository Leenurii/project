package com.room.main.dto;

import lombok.Data;

@Data
public class RoomInfraDTO {

	private int		r_bno;		// 고유번호
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
	public String getR_kind() {
		return r_kind;
	}
	public void setR_kind(String r_kind) {
		this.r_kind = r_kind;
	}
	public int getR_people() {
		return r_people;
	}
	public void setR_people(int r_people) {
		this.r_people = r_people;
	}
	public String getR_price() {
		return r_price;
	}
	public void setR_price(String r_price) {
		this.r_price = r_price;
	}
	public String getR_base() {
		return r_base;
	}
	public void setR_base(String r_base) {
		this.r_base = r_base;
	}
	public String getR_rent() {
		return r_rent;
	}
	public void setR_rent(String r_rent) {
		this.r_rent = r_rent;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	private String 	r_name;		// 방이름
	private String 	r_kind;		// 방 종류
	private int		r_people;	// 방 인원수
	private String 	r_price;	// 방 가격
	private String 	r_base;		// 기본 기능
	private String 	r_rent;		// 대여 항목
	private int 	count;		// 예약날 비활성화 위한 개수
}
