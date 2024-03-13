package Loop;

public class AtoZ {
	public static void main(String[] args) {
		//program to print char from A to Z
		char ch='A';
		while(ch<='Z') {
			System.out.print(ch+"  ");
			ch++;
		}
		System.out.println(" ");
		
		char ch1='Z';
		while(ch1>='A') {
			System.out.print(ch1+"  ");
			ch1--;
		}
	}
}
