package Loop;

public class SumOfEven {
public static void main(String[] args) {
	// sum of even values
	int sum=0;
	for(int i=1;i<=10;i++) {
		if(i%2==0) {
			sum=sum+i;
			System.out.println(sum);
		}
		
	}
	System.out.println(sum);
}
}
