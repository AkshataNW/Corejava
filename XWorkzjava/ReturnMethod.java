class ReturnMethod{
static int a=5;
static int b=5,sum;
static int sum (int c,int d){
return sum=c+d;
}
public static void main(String args[]){
sum(a,b);
System.out.println(sum);
}
}