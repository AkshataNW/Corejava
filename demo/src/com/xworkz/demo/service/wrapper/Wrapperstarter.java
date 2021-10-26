package com.xworkz.demo.service.wrapper;

public class Wrapperstarter {

	public static void main(String[] args) {
		
		//INTEGER
		
		//compare
		int num1=20;
		int num2=10;
		int num3=30;
		System.out.println(Integer.compare(num2, num3));
		
		Integer firstval =new Integer(809);
		Integer secondval =new Integer(50);
		
		//compareto
		System.out.println(secondval.compareTo(firstval));
		System.out.println(firstval.compareTo(500));
		System.out.println("hashcode is"+Integer.hashCode(num3));
		
		//equals
		
		System.out.println(firstval.equals(secondval));//boolean
		
		//firstval=new Integer(50);
		System.out.println("equalsmethod "+firstval.equals(secondval));
		
		//floatvalue
		float x=firstval.floatValue()/secondval;
		System.out.println("the floatvalue "+x);
		
		//hashcode
		int y=firstval.hashCode();
		System.out.println("hashcode is "+y);
		
		

		
		
		
		
		

	}

}
