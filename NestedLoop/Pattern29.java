package Patterns;

public class Pattern29 {
public static void main(String[] args) {
		/*	1aaa1
			b2b2b
			cc3cc
			d4d4d
			5eee5
		*/	
	char ch='a';
	for(int i=1;i<=5;i++) {
		
		for(int j=1;j<=5;j++) {
			if((i==j)||(i+j)==6) {
				System.out.print(i);
			}
			else {
				System.out.print(ch);
			}
				
		}
		System.out.println();
		ch++;
	}
}
}
