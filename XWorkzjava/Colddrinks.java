class Colddrinks{

Colddrinks(){
System.out.println("These are all the detials about colddrinnks: ");
} 

Colddrinks(String a,int b,float c){
System.out.println("The Colddrink is "+a+",number of bottles per month "+b+ " and the rating of "+a+" is "+c);
}

Colddrinks(int a,String b,float c){
System.out.println("The Colddrink is "+b+",number of bottles per month "+a+ " and the rating of "+b+" is "+c);
}



public static void main(String args[]){
Colddrinks a=new Colddrinks();
Colddrinks b=new Colddrinks("Sprite",40000 , 98.98f);
Colddrinks c=new Colddrinks(40000, "ThumpsUP", 98.98f);
}
}