package com.room.admin.dto;


import lombok.Data;


@Data
public class Room_rentDTO {

	private int rent_bno;
	private String rent_name;
	private int rent_price;
	public int getRent_bno() {
		return rent_bno;
	}
	public void setRent_bno(int rent_bno) {
		this.rent_bno = rent_bno;
	}
	public String getRent_name() {
		return rent_name;
	}
	public void setRent_name(String rent_name) {
		this.rent_name = rent_name;
	}
	public int getRent_price() {
		return rent_price;
	}
	public void setRent_price(int rent_price) {
		this.rent_price = rent_price;
	}

}
