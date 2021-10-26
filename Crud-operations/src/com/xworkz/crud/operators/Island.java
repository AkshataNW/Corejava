package com.xworkz.crud.operators;

public class Island {

	private String country;
	
	private String[] land=new String[5];
	private int counter=0;
	
	public Island() {
		// TODO Auto-generated constructor stub
		this("INDIA");
		System.out.println("This is default constructor");
	}
	
	public Island(String country) {
		System.out.println("Invoked Island");
		this.country=country;
		System.out.println("The Island  in : ".concat(country));
		
	}
	
	public String getCountry() {
		return country;
	}
	
	   public void addIslandName(String name) {
		// TODO Auto-generated method stub
         System.out.println("The Island names are : ".concat(name));
         if(this.counter<5) {
         this.land[this.counter]=name;
         this.counter++;
	}
         else {
        	 System.out.println("End");
         }
	   }
	   
	
	   public void displayDetails() {
		// TODO Auto-generated method stub
		   System.out.println("Invoked display Details");
	           for(int i=0;i<land.length;i++) {
	        	  System.out.println(this.land[i]);
	        	  
	           }
		}

		
	}

