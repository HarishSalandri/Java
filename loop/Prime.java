package programs;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		int count=0;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) 
				count++;
			
			}
		if(count==0) {
			System.out.println(num+" is a prime number ");
		}
			else {
				System.out.println(num+"  is not a prime number");
		}
	}
}
