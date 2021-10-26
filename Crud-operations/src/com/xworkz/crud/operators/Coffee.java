package com.xworkz.crud.operators;

public class Coffee {

	
	private String[] brand=new String[4];
    private int godzilla=0;
    
    public  void addBrand(String name) {
  	  System.out.println("Brand Name:"+name);
  	  System.out.println("Godzilla:".concat(String.valueOf(this.godzilla)));
  	  if(godzilla<brand.length) {
  		   this.brand[this.godzilla++]=name;
  	  }
  	  else {
  		  System.err.println("Array is Full");
  	  }
	}
    public void displayBrand() {
  	  for(int i=0;i<brand.length;i++) {
  		  System.out.println("Displayed Brand:".concat(String.valueOf(this.brand[i])));
  	  }
    }
    public void deleteReference(int index) {
  		
		if (index >= 0 && index <=brand.length) {
			this.brand[index] = null;
			System.out.println("Deleting the Reference:".concat(String.valueOf(this.brand)));

		} else {
			System.err.println("index is deleted:".concat(String.valueOf(this.godzilla)));
		}

	}
	public void UpdateWork(int index, String nothing) {
		if (index>= 0 && index < brand.length && nothing!=null) {
			this.brand[index]=nothing;
System.out.println("Updating Work:".concat(String.valueOf(index)));

		}
		else {
			System.err.println("canoot be updated:");
		}
	}
}
