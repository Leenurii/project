package com.room.admin.dto;

import lombok.Data;

@Data
public class RoomKindDTO {
	private  int room_bno;
	private String room_class;
	public int getRoom_bno() {
		return room_bno;
	}
	public void setRoom_bno(int room_bno) {
		this.room_bno = room_bno;
	}
	public String getRoom_class() {
		return room_class;
	}
	public void setRoom_class(String room_class) {
		this.room_class = room_class;
	}
	public int getRoom_cnt() {
		return room_cnt;
	}
	public void setRoom_cnt(int room_cnt) {
		this.room_cnt = room_cnt;
	}
	private int room_cnt;
}
