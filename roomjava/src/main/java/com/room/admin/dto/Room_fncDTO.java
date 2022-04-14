package com.room.admin.dto;


import lombok.Data;


@Data
public class Room_fncDTO {

	private int fnc_bno;
	private String fnc_name;
	private int fnc_price;
	public int getFnc_bno() {
		return fnc_bno;
	}
	public void setFnc_bno(int fnc_bno) {
		this.fnc_bno = fnc_bno;
	}
	public String getFnc_name() {
		return fnc_name;
	}
	public void setFnc_name(String fnc_name) {
		this.fnc_name = fnc_name;
	}
	public int getFnc_price() {
		return fnc_price;
	}
	public void setFnc_price(int fnc_price) {
		this.fnc_price = fnc_price;
	}

}
