package ConditionalStatements;

import java.util.Scanner;

public class MaxOf3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first value");
	int a=sc.nextInt();
	System.out.println("Enter Second value");
	int b=sc.nextInt();
	System.out.println("Enter Third value");
	int c=sc.nextInt();
	if(a>b &&a>c) {
		System.out.println("Maximum value is "+a);
	}
	else if(b>c) {
		System.out.println("Maximum value is "+b);
	}
	else {
		System.out.println("Maximum value is "+c);
	}
	
}
}
