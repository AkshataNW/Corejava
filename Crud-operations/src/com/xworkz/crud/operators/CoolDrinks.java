package com.xworkz.crud.operators;

public class CoolDrinks {
	
	private String[] cooldrinks=new String[7];
	private String brand;
	private int godzilla;
    
    public CoolDrinks() {
    	this("Colddrinks");
		// TODO Auto-generated constructor stub
    	System.out.println("This is the default constructor");
	}
    
    public CoolDrinks(String brand) {
    	this.brand=brand;
    	System.out.println("The Brand of the cool drinks ".concat(brand));
    }
    
    public String getBrand() {
		return brand;
	}
    
    
    
    
    public void addCoolDrinks(String name) {
		// TODO Auto-generated method stub
    	System.out.println("cooldrinks name : ".concat(name));
    	if(this.godzilla<this.cooldrinks.length) {
    		System.out.println("Godzilla ".concat(String.valueOf(this.godzilla)));//it starts from 0 index
    	this.cooldrinks[this.godzilla++]=name;
    	//System.out.println("Godzilla ".concat(String.valueOf(this.godzilla)));//it starts from 1
    }
    	else {
    		System.err.println("array is full with index".concat(String.valueOf(this.godzilla)));
    	}
	}
    
    public void displaydetails() {
		// TODO Auto-generated method stub
    	System.out.println("Invoked displayDetails");
        for(int i=0;i<this.cooldrinks.length;i++) {
        	System.out.println("Display of Cooldrinks : ".concat(String.valueOf(this.cooldrinks[i])));
        }
	}
    
    public void delete(int index) {
    	if(index>=0 && index<cooldrinks.length) {
    		this.cooldrinks[index]=null;
         }
    	else {
    		System.err.println("index should be gretaer than zero and lesser than ".concat(String.valueOf(this.cooldrinks.length)));
    	}
    
    }
    
    public void update(int index , String name) {
		// TODO Auto-generated method stub
        if(index>=0 && index<cooldrinks.length && name!=null ) {
        	this.cooldrinks[index]=name;
        }
	}
    	  

	}
	



