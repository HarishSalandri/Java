package Operators;

import java.util.Scanner;

public class Assignment {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number: ");
	int a=sc.nextInt();
	a+=10;
	System.out.println(a);
	a-=10;
	System.out.println(a);
	a*=10;
	System.out.println(a);
	a/=10;
	System.out.println(a);
	a%=10;
	System.out.println(a);
	
	}
}
