package Patterns;

public class Pattern24 {
public static void main(String[] args) {
	int space=3,star=0;
	for(int i=1;i<=5;i++) {
		if(i<=3) {
		space--;
		star++;
		}else {
			space++;
			star--;
		}
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=star;k++) {
			System.out.print("*");
		}
		for(int j=1;j<=4;j++) {
			if(i==1||i==5) {
				System.out.print((" "));
			}else {
				System.out.print("*");
			}
		
		}
		for(int k=1;k<=star;k++) {
			System.out.print("*");
		
	}
		
		
		
		System.out.println();
	}
}
}
