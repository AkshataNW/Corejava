package com.xworkz.crud.operators;

public class Airport {
	
	private String[] fly=new String[7];
	private int godzilla;
    
    public Airport() {
    	
		// TODO Auto-generated constructor stub
    	System.out.println("This is the default constructor");
	}
     
    public void addAirport(String name) {
		// TODO Auto-generated method stub
    	System.out.println("plane  name : ".concat(name));
    	if(this.godzilla<this.fly.length) {
    		System.out.println("Godzilla ".concat(String.valueOf(this.godzilla)));//it starts from 0 index
    	this.fly[this.godzilla++]=name;
    	//System.out.println("Godzilla ".concat(String.valueOf(this.godzilla)));//it starts from 1
    }
    	else {
    		System.err.println("array is full with index".concat(String.valueOf(this.godzilla)));
    	}
	}
    
    public void displaydetails() {
		// TODO Auto-generated method stub
    	System.out.println("Invoked displayDetails");
        for(int i=0;i<this.fly.length;i++) {
        	System.out.println("Display of plane : ".concat(String.valueOf(this.fly[i])));
        }
	}
    
    public void delete(int index) {
    	if(index>=0 && index<fly.length) {
    		this.fly[index]=null;
         }
    	else {
    		System.err.println("index should be gretaer than zero and lesser than ".concat(String.valueOf(this.fly.length)));
    	}
    
    }
    
    public void update(int index , String name) {
		// TODO Auto-generated method stub
        if(index>=0 && index<fly.length && name!=null ) {
        	this.fly[index]=name;
        }
	}
  
	}
	
