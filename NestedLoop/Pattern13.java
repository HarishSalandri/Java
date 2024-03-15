package Patterns;

public class Pattern13 {
public static void main(String[] args) {

			/*	*
				**
				* *
				*  *
				*****
			*/
	int star=-1;
	for(int i=0;i<=5;i++) {
		star++;
		for(int j=1;j<=star;j++) {
			if(i==5||j==1||i==j)
			System.out.print("*");
		
		else 
			System.out.print(" ");
		
		}
		System.out.println();
	}
}
}
