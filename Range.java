package ConditionalStatements;

import java.util.Scanner;

public class Range {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		if(n>10&&n<20) {
			System.out.println("In The Range");
		}else {
			System.out.println("In The not Range");
		}
	}
}
