package com.foodapp.foodapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {
	@Id
   private int NumberOfItems;
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String Item;
	private int Price;
	private int Total_Price;
public int getNumberOfItems() {
		return NumberOfItems;
	}
	public void setNumberOfItems(int numberOfItems) {
		NumberOfItems = numberOfItems;
	}
	public String getItem() {
		return Item;
	}
	public void setItem(String item) {
		Item = item;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getTotal_Price() {
		return Total_Price;
	}
	public void setTotal_Price(int total_Price) {
		Total_Price = total_Price;
	}


}
