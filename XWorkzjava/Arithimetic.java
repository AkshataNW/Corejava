class Arithimetic{

void addition(float a,float b,float c,float d){
float sum=a+b+c+d;
System.out.println(sum);
}


void subtraction(float a,float b,float c,float d){
float sub=a-b-c-d;
System.out.println(sub);
}

public static void main(String args[]){
Arithimetic a=new Arithimetic();
a.addition(2,3,12,4);
a.subtraction(1,9,4,2);
}
}