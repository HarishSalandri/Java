package Patterns;

public class Pattern31 {
public static void main(String[] args) {
	int k=3;
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=4;j++) {
			System.out.print(k+" ");
			k=k+3;
		}
		System.out.println();
	}
}
}
