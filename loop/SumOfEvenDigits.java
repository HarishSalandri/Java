package programs;

public class SumOfEvenDigits {
public static void main(String[] args) {
	int num=53861247,rem=0,sum=0;
	while(num>0) {
		rem=num%10;
		num/=10;
		if(rem%2==0) {
			System.out.println(rem);
			sum=sum+rem;	
		}
		
	}
	System.out.println(sum);
	
	
}
}
