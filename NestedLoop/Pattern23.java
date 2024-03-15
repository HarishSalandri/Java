package Patterns;

public class Pattern23 {
public static void main(String[] args) {
	int star=0;
	for(int i=1;i<=5;i++) {
		if(i<=3) {
			star++;
		}else {
			star--;
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
