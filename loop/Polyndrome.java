package programs;

import java.util.Scanner;

public class Polyndrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num=sc.nextInt();
	int rem,rev=0,number=num;
	while(num>0) {
		rem=num%10;
		rev=rev*10+rem;
		num/=10;
	}
	if(rev==number) {
		System.out.println("Polyndrome");
	}
	else {
		System.out.println("not Polyndrome");
	}
}
}
