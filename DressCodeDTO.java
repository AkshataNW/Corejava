package com.xworkz.dp.dto;

public class DressCodeDTO {

	
	private String material;
	private String color;
	private String gender;
	private float size;
	private float price;
	
	
	public DressCodeDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("Invoked no-arg Constructor");
	}


	public DressCodeDTO(String material, String color, String gender, float size, float price) {
		super();
		this.material = material;
		this.color = color;
		this.gender = gender;
		this.size = size;
		this.price = price;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public float getSize() {
		return size;
	}


	public void setSize(float size) {
		this.size = size;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
