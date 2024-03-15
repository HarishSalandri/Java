package Patterns;

public class Pattrn4 {
public static void main(String[] args) {
		/*	*****
			****
			***
			**
			*  
		*/
	int star=6;
	for(int i=0;i<=5;i++) {
		star--;
		
		for(int j=1;j<=star;j++) {
			System.out.print("*");
		}
		
		System.out.println();	
	}
		
	
}
}
