package com.xworkz.crud.operators;

public class Restaurant {

	private String style;
	private String name;
	private String[] restaurant=new String[5];
	private int counter=0;
	
	public Restaurant() {
		// TODO Auto-generated constructor stub
		this("SouthStyle");
		System.out.println("This is default constructor");
	}
	
	public Restaurant(String style) {
		System.out.println("Invoked Restaurant");
		this.style=style;
		System.out.println("The Restaurant  is : ".concat(style));
		
	}
	
	public String getStyle() {
		return style;
	}
	
	   public void addRestaurantName(String name) {
		// TODO Auto-generated method stub
         System.out.println("The Restaurant names are : ".concat(name));
         if(this.counter<5) {
         this.restaurant[this.counter]=name;
         this.counter++;
	}
         else {
        	 System.out.println("End");
         }
	   }
	   
	
	   public void displayDetails() {
		// TODO Auto-generated method stub
		   System.out.println("Invoked display Details");
	           for(int i=0;i<restaurant.length;i++) {
	        	  System.out.println(this.restaurant[i]);
	        	  
	           }
		}

		
	}
