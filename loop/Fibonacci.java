package programs;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number: ");
	int num=sc.nextInt();
	int a=1,b=1;
	System.out.println("From 1 to "+num+" fibonacci siries: ");
	System.out.print(a+" ");
	System.out.print(b+" ");
	
	while(a+b<=num) {
		int res=a+b;
		System.out.print(res+" ");
		a=b;
		b=res;
		
	}
	
}
}
