package Patterns;

public class Pattern30 {
public static void main(String[] args) {
		/*		aaaaa
				bbbbb
				ccccc
				ddddd
				eeeee
		*/		
	char ch='a';
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			System.out.print(ch);
		}
		System.out.println();
		ch++;
	}
}
}
