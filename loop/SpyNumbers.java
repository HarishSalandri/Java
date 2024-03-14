package programs;

public class SpyNumbers {
public static void main(String[] args) {
	//Spy Number sum of digits==product of digits
	int num=22,sum=0,product=1,rem;
	while(num>0) {
		rem=num%10;
		sum=sum+rem;
		product=product*rem;
		num=num/10;
	}
	System.out.println(sum);
	System.out.println(product);
	if(sum==product) {
		System.out.println(" number is Spy");
	}
	else {
		System.out.println(" number not is Spy");
	}
	
}
}
