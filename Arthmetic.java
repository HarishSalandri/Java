package Operators;
import java.util.*;
public class Arthmetic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number: ");
		int a=sc.nextInt();
		System.out.println("enter the Second number: ");
		int b=sc.nextInt();
		int c;
		String s="Hari";
		
		System.out.println(s+" concatination "+a);
		c=a+b;
		System.out.println("Addition of two numbers: "+c);
		c=a-b;
		System.out.println("Substraction of two numbers: "+c);
		c=a*b;
		System.out.println("Multiplication of two numbers: "+c);
		c=a/b;
		System.out.println("Division of two numbers: "+c);
		c=a%b;
		System.out.println("Module of two numbers: "+c);
		
		
		
	}
}
