package com.xworkz.crud.operators;
	
	public class Resort {
	
		private String quality;
		private String name;
		private String[] nature=new String[5];
		private int counter=0;
		
		public Resort() {
			// TODO Auto-generated constructor stub
	    this("Good");
	    System.out.println("This is default constructor");
	}
	
	public Resort(String quality) {
		System.out.println("Invoked Resort");
		this.quality=quality;
		System.out.println("The Restaurant  is : ".concat(quality));
		
	}
	
	public String getQuality() {
		return quality;
	}
	
	   public void addResortName(String name) {
		// TODO Auto-generated method stub
	     System.out.println("The Resort names are : ".concat(name));
	     if(this.counter<5) {
	     this.nature[this.counter]=name;
	     this.counter++;
	     }
	      else {
	    	 System.out.println("End");
	     }
 }
	   
	
	   public void displayDetails() {
		// TODO Auto-generated method stub
		   System.out.println("Invoked display Details");
		   for(int i=0;i<nature.length;i++) {
		   System.out.println(this.nature[i]);
			        	  
     }
  }
	
}

