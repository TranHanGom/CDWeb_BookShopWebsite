package com.cnpm.utils;

import java.util.Optional;

import com.cnpm.model.Room;

public class Item {
	private Room room;

	private int quantity;

	public Item() {
		
	}

	public Item(Room room, int quantity) {
		super();
		this.room = room;
		this.quantity = quantity;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
