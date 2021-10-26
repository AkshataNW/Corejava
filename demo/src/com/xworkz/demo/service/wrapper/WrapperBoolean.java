package com.xworkz.demo.service.wrapper;

public class WrapperBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				boolean b=true;
				boolean c=false;
				String name="Akshata";
				
				Boolean obj=new Boolean(b);
				
				
				
				//logicalAnd
				//System.out.println(getBoolean(b));
				System.out.println("Boolean logical AND "+Boolean.logicalAnd(c, b));
				
				//parseboolean
				System.out.println(Boolean.parseBoolean(null));//for null and false it gives the output as false
				
				
				System.out.println("Boolean value "+obj.booleanValue());
				//valueof
				System.out.println("value of "+Boolean.valueOf(b));
				
				System.out.println("String name"+Boolean.getBoolean(name));
				
				//toString
				System.out.println("to String "+Boolean.toString(c));
				
				//hashcode
				System.out.println("Hashcode "+Boolean.hashCode(c));
				// int
				
				int a=1005;
				Integer obj=a;
				int value=45;
				System.out.println("Byte Value:"+obj.byteValue());
				System.out.println("Short Value:"+obj.shortValue());
				System.out.println("Double Value:"+obj.doubleValue());
				System.out.println(Integer.bitCount(value));
				System.out.println(Integer.highestOneBit(value));
				
				//long
				long l=199999;
				Long obj=new Long(l);
				String name="varsha";
				System.out.println("Bit Count:"+Long.bitCount(l));
				System.out.println("Get Long:"+Long.getLong(name));
				System.out.println("Reverse:"+Long.lowestOneBit(l));
				System.out.println("LongValue:"+obj.longValue());
				System.out.println("Reverse:"+Long.reverse(l));
				
				//short
				short s=20;
				Short obj=new Short(s);
				System.out.println();
				System.out.println("ToString:"+obj.toString());
				System.out.println("static ToString:"+Short.toString(s));
				System.out.println("Value Of:"+Short.valueOf(s));
				System.out.println("Hash Code:"+obj.hashCode());
				System.out.println("static Hash Code"+Short.hashCode(s));
				
				
				//double
				
				double d=1500.0d;
				double d1=1550.0d;
				Double obj=new Double(d);
				System.out.println("Byte Value:"+obj.byteValue());
				System.out.println("Compare:"+Double.compare(d1, d));
		        System.out.println("Hash Code:"+obj.hashCode());
		        System.out.println("Double Value:"+obj.doubleValue());
		        System.out.println("Value Of:"+Double.valueOf(d1));
		        
		        
		        //float
		        float f=15.5f;
				Float obj=new Float(f);
				System.out.println("FloatToIntBits:"+Float.floatToIntBits(f));
				System.out.println("FloatToRawBits:"+Float.floatToRawIntBits(f));
				System.out.println("isNaN:"+obj.isNaN());
				System.out.println("isInfinite:"+Float.isFinite(f));
				System.out.println("intValue:"+obj.intValue());
				
				//boolean
				
				boolean b=true;
				boolean b1=false;
				String name="varsha";
				Boolean obj=new Boolean(b);
				System.out.println("Boolean Value:"+obj.booleanValue());
				System.out.println("Compare:"+Boolean.compare(b, b1));
				System.out.println("Compare To:"+obj.compareTo(obj));
				System.out.println("Hash Code:"+obj.hashCode());
				System.out.println("Get Boolean:"+Boolean.getBoolean(name));
				
				//byte 
		        byte b=50;
				byte b1=60;
				Byte obj=new Byte(b);
				System.out.println("Byte Value:"+obj.byteValue());
				System.out.println("Compare:"+Byte.compare(b, b1));
				System.out.println("CompareTo:"+obj.compareTo(obj));
				System.out.println("Double:"+obj.doubleValue());
				System.out.println("Float:"+obj.equals(obj));
				
				//char
		        char a='v';
				Character obj=new Character(a);
				System.out.println("Char Count:"+Character.charCount(a));
				System.out.println("Char Value:"+obj.charValue());
				System.out.println("Hash Code:"+obj.hashCode());
				System.out.println("Get Type:"+Character.getType(a));
				System.out.println("Get Name:"+Character.getName(a));
			}
				

	}

}
