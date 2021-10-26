class Bookstall{

void Book(){
String name="Apoorva";
int a=50;
System.out.println("The name of the book is "+name+ " and the number of books present are "+a);
}


void Colors(){
String a="Paintbox";
int col=12;
System.out.println("It is the  "+a+ " and the number of colors present are "+col);
}

public static void main(String args[]){
Bookstall a=new Bookstall();
a.Book();
a.Colors();
}

}