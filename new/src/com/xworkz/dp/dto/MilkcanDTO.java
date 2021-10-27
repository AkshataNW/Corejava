package com.xworkz.dp.dto;

public class MilkcanDTO {
	
	private String quantity;
	private String shape;
	private boolean quality;
	private String color;
	private float price;
	
	
	public MilkcanDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("Invoked no-arg constructor");
	}


	public MilkcanDTO(String quantity, String shape, boolean quality, String color, float price) {
		super();
		this.quantity = quantity;
		this.shape = shape;
		this.quality = quality;
		this.color = color;
		this.price = price;
	}


	public String getQuantity() {
		return quantity;
	}


	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}


	public String getShape() {
		return shape;
	}


	public void setShape(String shape) {
		this.shape = shape;
	}


	public boolean isQuality() {
		return quality;
	}


	public void setQuality(boolean quality) {
		this.quality = quality;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}
	
}
