package ConditionalStatements;

import java.util.Scanner;

public class UpperCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the charector: ");
		char ch=sc.next().charAt(0);
		if(ch>='A'&&ch<='Z') {
			System.out.println("given charecter is Upper Case alphabet: "+ch);
		}else {
			System.out.println("given charecter is not Upper Case alphabet: "+ch);
		
		}
		
		
	}
}
