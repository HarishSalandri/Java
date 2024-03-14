package programs;

import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num=sc.nextInt();
	int rem,rev=0;
	while(num>0) {
		rem=num%10;
		rev=rem+rev*10;
		
		num/=10;
	}
	System.out.println(rev);
}
}
