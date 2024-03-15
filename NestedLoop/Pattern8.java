package Patterns;

public class Pattern8 {
public static void main(String[] args) {
		/*	   *
				*
				 *
				  *
				   *
		*/
	
	int star=1,space=-1;
	for(int i=1;i<=5;i++) {
		space++;
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
