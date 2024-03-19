package methods;

public class Method4 {
public static void login(String un, String pwd) {
	System.out.println("login "+un+" successfully");
	
}
public static void main(String[] args) {
	login("Harish","5454");
	add(10,50);
}
public static void add(int a, int b) {
	int c=a+b;
	System.out.println(c);
}
}
