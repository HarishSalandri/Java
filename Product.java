package Loop;

import java.util.Scanner;

public class Product {
public static void main(String[] args) {
	
	//Product of odd values from 1 to n
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number: ");
	int n=sc.nextInt();
	int product=1;
	for(int i=1;i<=n;i++ ) {
		if(i%2==1) {
			product*=i;
		}
	}
	System.out.println(n+" Product is "+product);
			
}
}
