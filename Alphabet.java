package ConditionalStatements;

import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the charector: ");
		char ch=sc.next().charAt(0);
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
			System.out.println("given charecter is  alphabet: "+ch);
		}else {
			System.out.println("given charecter is not alphabet: "+ch);
		
		}
		
		
	}
}
