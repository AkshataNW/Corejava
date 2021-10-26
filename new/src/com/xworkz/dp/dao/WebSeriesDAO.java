package com.xworkz.dp.dao;

import com.xworkz.dp.dto.WebSeriesDTO;

public class WebSeriesDAO {

	private WebSeriesDTO[] webseriesDTOs = new WebSeriesDTO[10];
    private  int count=0;
    
    private void save(WebSeriesDTO dto) {
    	
    		if(count<webseriesDTOs.length && dto!=null) {
    			
    		this.webseriesDTOs[this.count++]=dto;
  
    		System.out.println("Invoked create DTO ".concat(String.valueOf(dto)));
    	}
    		else {
    			System.err.println("Create method invalid ".concat(String.valueOf(count)));
    		}
    		
    }
		
      private void delete(int index) {
    	if(index>=0 && index<webseriesDTOs.length) {
    	
		this.webseriesDTOs[index]=null;
		System.out.println("Invoked delete ".concat(String.valueOf(index)));
    	}
    	else {
    		System.err.println("Delete method invalid and is pointing to ".concat(String.valueOf(index)));
		}
     }
      
      private void update(int index,WebSeriesDTO name) {
    	  if(index>0 && index<webseriesDTOs.length && name!=null) {
    	  this.webseriesDTOs[index]=name;
    	  System.out.println("Update method valid at index ".concat(String.valueOf(index))+"  ");
    	  }
    	  else {
    		  System.err.println("Update method invalid");
    	  }

	}
      
      
      public WebSeriesDTO[] getWebseriesDTOs() {
		return webseriesDTOs;
	}
      
}
