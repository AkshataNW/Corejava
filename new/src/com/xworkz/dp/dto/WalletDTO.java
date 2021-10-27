package com.xworkz.dp.dto;

public class WalletDTO {
	
	private String companyName;
	private String material;
	private int totalcompartments;
	private float price;
	private int coinCompartment;
	
    public WalletDTO() {
		System.out.println("Invoked no-arg constructor");
    }

	public WalletDTO(String companyName, String material, int totalcompartments, float price, int coinCompartment) {
		super();
		this.companyName = companyName;
		this.material = material;
		this.totalcompartments = totalcompartments;
		this.price = price;
		this.coinCompartment = coinCompartment;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getTotalcompartments() {
		return totalcompartments;
	}

	public void setTotalcompartments(int totalcompartments) {
		this.totalcompartments = totalcompartments;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getCoinCompartment() {
		return coinCompartment;
	}

	public void setCoinCompartment(int coinCompartment) {
		this.coinCompartment = coinCompartment;
	}
    
}
