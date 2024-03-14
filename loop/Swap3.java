package programs;

public class Swap3 {
public static void main(String[] args) {
	//swap using 3rd variable
	int a=20,b=30,c;
	System.out.println("before swapping a= "+a);
	System.out.println("before swapping b= "+b);
	c=a;
	a=b;
	b=c;
	System.out.println("after swapping a= "+a);
	System.out.println("after swapping b= "+b);
	System.out.println("");
	//swap without using 3rd variable
	int d=40,e=30;
	System.out.println("before swapping d= "+d);
	System.out.println("before swapping e= "+e);
	d=d+e;
	e=d-e;
	d=d-e;
	System.out.println("after swapping d= "+d);
	System.out.println("after swapping e= "+e);
}
}
