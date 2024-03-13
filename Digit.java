package ConditionalStatements;

import java.util.Scanner;

public class Digit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the charecter: ");
	char ch=sc.next().charAt(0);
	if(ch>='0'&&ch<='9') {
		System.out.println("charector contains digit");
	}
	else {
		System.out.println("charector contains not digit");
	}
}
}
