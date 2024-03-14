package programs;

public class Harshad {
public static void main(String[] args) {
	// Harshad number ex-21=21/3,156/12
	int num=111,sum=0,rem,temp=num;
	while(num>0) {
		rem=num%10;
		
		sum=sum+rem;
		num/=10;
	}
	if(temp%sum==0) {
		System.out.println(" Harshad Number");
	}
	else {
		System.out.println(" Not a Harshad Number");
	}
	
}
}
