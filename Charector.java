package ConditionalStatements;

import java.util.Scanner;

public class Charector {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the charector: ");
		char ch=sc.next().charAt(0);
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))  {
			System.out.println("given charecter is alphabet: "+ch);
		}
		else if(ch>='0'&&ch<='9') {
			System.out.println("given charecter is digit: "+ch);
		}
		else {
			System.out.println("given Charector is Special Charector: "+ch);
		}
		
		
	}
}
