package ConditionalStatements;

import java.util.Scanner;

public class Equal {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First number: ");
	int a=sc.nextInt();
	System.out.println("Enter Second numbe: ");
	int b=sc.nextInt();
	if(a%10==b%10) {
		System.out.println("given numbers are equal");
	}
	else {
		System.out.println("given numbers are not equal");
	}
	}
}
