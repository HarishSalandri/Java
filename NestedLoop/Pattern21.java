package Patterns;

public class Pattern21 {
public static void main(String[] args) {
			/*	   *
				  ***
				 *****
				  ***
				   *
		   */

	int star=-1,space=3;
	for(int i=1;i<=5;i++) {
		if(i<=3) {
			star+=2;
			space--;
			
		}
		else {
			star-=2;
			space++;
		}
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=star;k++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
