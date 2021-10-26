package com.xworkz.crud.operators;

public class Chocolate {

	private String product;
	private String name;
	private String[] choconame=new String[5];
	private int counter=0;
	
	public Chocolate() {
		this("Cadbury");
		System.out.println("This is default constructor");
		
	}
	
	public Chocolate(String product) {
		System.out.println("Invoked Chocolate");
		this.product=product;
		System.out.println("The chocolate name is : ".concat(product));
		
	}
	
	public String getProduct() {
		return product;
	}
	
	   public void addChocolateName(String name) {
		// TODO Auto-generated method stub
         System.out.println("The chocolate names are : ".concat(name));
         this.choconame[this.counter]=name;
         this.counter++;
	}
	
	   public void displayDetails() {
		// TODO Auto-generated method stub
		   System.out.println("Invoked display Details");
           for(int i=0;i<choconame.length;i++) {
        	  System.out.println(this.choconame[i]);
        	  
           }
	}

	
}
