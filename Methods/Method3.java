package methods;

public class Method3 {
public static void main(String[] args) {
	factorial(6);
}
public static void factorial(int num) {
	int fact=1;
	for(int i=1;i<=num;i++) {
		fact=fact*i;
	}
	System.out.println(fact);
	
}
}
