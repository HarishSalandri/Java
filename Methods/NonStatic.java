package methods;

public class NonStatic {
	int i=10;
	int j=20;
	int c=i+j;
public static void main(String[] args) {
	NonStatic obj=new NonStatic();
	System.out.println(obj);
	System.out.println(obj.i);
	System.out.println(obj.j);
	System.out.println(obj.c);
	System.out.println("------------");
	NonStatic obj1=new NonStatic();
	System.out.println(obj1);
	System.out.println(obj1.i);
	System.out.println(obj1.j);
	System.out.println(obj1.c);
	}
}
