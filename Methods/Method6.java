package methods;

public class Method6 {
public static void main(String[] args) {
	System.out.println("Hello World");
	System.out.println(run(546.2));
	empty();
}
public static int run(double d) {
	return (int)d;
	
}
public static void empty() {
	System.out.println("empty method not returning any value");
	return;
}
}
