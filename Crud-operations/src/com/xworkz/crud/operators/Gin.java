package com.xworkz.crud.operators;

public class Gin {

	private String est;
	private String[] ingr=new String[3];
	private int counter=0;
	
	public Gin() {
		// TODO Auto-generated constructor stub
		this("11 century AD");
		System.out.println("This is default constructor");
	}
	
	public Gin(String est) {
		System.out.println("Invoked Gin");
		this.est=est;
		System.out.println("The Restaurant  is : ".concat(est));
		
	}
	
	public String getEst() {
		return est;
	}
	
	   public void addGinName(String name) {
		// TODO Auto-generated method stub
         System.out.println("The Gin names are : ".concat(name));
         if(this.counter<3) {
         this.ingr[this.counter]=name;
         this.counter++;
	}
         else {
        	 System.out.println("End");
         }
	   }
	   
	
	   public void displayDetails() {
		// TODO Auto-generated method stub
		   System.out.println("Invoked display Details");
	           for(int i=0;i<ingr.length;i++) {
	        	  System.out.println(this.ingr[i]);
	        	  
	           }
		}

		
	

}
