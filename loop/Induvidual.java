package programs;

public class Induvidual {
public static void main(String[] args) {
	//extract the individual number
	int num=1254, rem;
	while(num>0) {
	rem=num%10;
	System.out.println(rem);
	num=num/10;
	}
}
}
