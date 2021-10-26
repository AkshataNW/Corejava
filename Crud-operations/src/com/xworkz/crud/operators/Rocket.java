package com.xworkz.crud.operators;

public class Rocket {
	
   private String launch;
	
	private String[] fly=new String[5];
	private int counter=0;
	
	public Rocket() {
		// TODO Auto-generated constructor stub
		this("ISRO");
		System.out.println("This is default constructor");
	}
	
	public Rocket(String launch) {
		System.out.println("Invoked Rocket");
		this.launch=launch;
		System.out.println("The Island  in : ".concat(launch));
		
	}
	
	public String getLaunch() {
		return launch;
	}
	
	   public void addRocketName(String name) {
		// TODO Auto-generated method stub
         System.out.println("The Rocket names are : ".concat(name));
         if(this.counter<5) {
         this.fly[this.counter]=name;
         this.counter++;
	}
         else {
        	 System.out.println("End");
         }
	   }
	   
	
	   public void displayDetails() {
		// TODO Auto-generated method stub
		   System.out.println("Invoked display Details");
	           for(int i=0;i<fly.length;i++) {
	        	  System.out.println(this.fly[i]);
	        	  
	           }
		}


}
