package com.xworkz.crud.operators;

public class Waterfall {

	private String state;
	
	private String[] falls=new String[5];
	private int counter=0;
	
	public Waterfall() {
		// TODO Auto-generated constructor stub
		this("KARNATAKA");
		System.out.println("This is default constructor");
	}
	
	public Waterfall(String state) {
		System.out.println("Invoked Waterfall");
		this.state=state;
		System.out.println("The Waterfall  is in : ".concat(state));
		
	}
	
	public String getState() {
		return state;
	}
	
	   public void addWaterfallName(String name) {
		// TODO Auto-generated method stub
         System.out.println("The Waterfall names are : ".concat(name));
         if(this.counter<5) {
         this.falls[this.counter]=name;
         this.counter++;
	}
         else {
        	 System.out.println("End");
         }
	   }
	   
	
	   public void displayDetails() {
		// TODO Auto-generated method stub
		   System.out.println("Invoked display Details");
	           for(int i=0;i<falls.length;i++) {
	        	  System.out.println(this.falls[i]);
	        	  
	           }
		}

		
	}


