package methods;

public class Factorial {
public static String Factorial(int num) {
	int fact=1;
	for(int i=1;i<=num;i++) {
		fact=fact*i;
	}
	
	return ("Factorial is "+fact);
}
public static void main(String[] args) {
	String res=Factorial(5);
	System.out.println((res));
}
}
