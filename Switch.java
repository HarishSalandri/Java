package ConditionalStatements;

import java.util.Scanner;

public class Switch {
@SuppressWarnings("unused")
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the charector: ");
	char ch=sc.next().charAt(0);
	switch(ch) {
	case 'a':
		System.out.println(ch+" charecter is vowel");
		break;
	
	case 'e':
		System.out.println(ch+" charecter is vowel");
		break;
	case 'i':
		System.out.println(ch+" charecter is vowel");
		break;
	case 'o':
		System.out.println(ch+" charecter is vowel");
		break;
	case 'u':
		System.out.println(ch+" charecter is vowel");
		break;

	
	default:System.out.println("Consonent");
		
	}
}
}
