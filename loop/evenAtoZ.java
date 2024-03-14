package programs;

public class evenAtoZ {
public static void main(String[] args) {
	//program to print alphabets from A to Z Where ASCII values must be even
	
	for(char ch='A';ch<='Z';ch++) {
		if(ch%2==0) {
			System.out.println(ch);
		}
	}
}
}
