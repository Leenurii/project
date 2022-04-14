package com.room.admin.dto;


import lombok.Data;


@Data
public class PaymentDTO {

	public int getPay_bno() {
		return pay_bno;
	}
	public void setPay_bno(int pay_bno) {
		this.pay_bno = pay_bno;
	}
	public String getPay_name() {
		return pay_name;
	}
	public void setPay_name(String pay_name) {
		this.pay_name = pay_name;
	}
	public String getPay_account() {
		return pay_account;
	}
	public void setPay_account(String pay_account) {
		this.pay_account = pay_account;
	}
	public String getPay_bank() {
		return pay_bank;
	}
	public void setPay_bank(String pay_bank) {
		this.pay_bank = pay_bank;
	}
	private int pay_bno;
	private String pay_name;
	private String pay_account;
	private String pay_bank;
}
