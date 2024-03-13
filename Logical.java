package Operators;

public class Logical {
public static void main(String[] args) {
	int boy=21;
	int girl=20;
	if(boy>=21&&girl>=21) {
		System.out.println("both are elgible for marriage");
	}
	else {
		System.out.println("both are not elgible for marriage");
	}
	char ch='a';
	if( (ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')) {
		System.out.println("charecter is vowel");
		
	}
	else {
		System.out.println("charecter is not vowel");
	}
}
}
