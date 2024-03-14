package programs;

public class SumOfPrimeNumbers {
public static void main(String[] args) {
	int num=5321687,rem,sum=0;
	while(num>0) {
		rem=num%10;
		
		num/=10;
		int count=0;
	for(int i=2;i<=rem/2;i++) {
		if(rem%i==0) {
			count++;
		}
	
	}
	
	if(count==0) {
		sum=sum+rem;
	}
	
	}
	System.out.println(sum);
	
}
}
