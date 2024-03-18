package Patterns;

public class Pattern32 {
public static void main(String[] args) {
	int space=2,num=1;
	for(int i=1;i<=3;i++) {
		space--;
		num+=2;
		int k=1;
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		for(int l=1;l<=num;l++) {
			if(l<(num/2)+1) {
			System.out.print(k++);
			}else {
				System.out.print(k--);
			}
		
	}
		
		System.out.println();
	}
}
}
