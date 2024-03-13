package Loop;

public class A1a {
public static void main(String[] args) {
	//print A1a to Z26z
	char ch='A';
	int i=1;
	char ch1='a';
	while(ch<='Z') {
		System.out.println(ch+""+i+""+ch1);
		ch++;
		i++;
		ch1++;
	}
	
	int fact=1;
	int j=1;
	
	while(j<=5) {
		
		fact*=j;
		j++;
	}
	System.out.println(fact);
}
}
