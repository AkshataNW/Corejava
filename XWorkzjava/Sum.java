class Sum{
static int p=10; 
static int q=10;
static int sum;
static int sum(int a, int b){
sum=a+b;
return sum;
}
public static void main(String args[]){
sum(p,q);
System.out.println(sum);
}
}

