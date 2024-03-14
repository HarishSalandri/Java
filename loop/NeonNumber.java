package programs;

public class NeonNumber {
public static void main(String[] args) {
	//NeonNumber ex=9=9*9=81,8+1=9
	int num=9,rem;
	int s=num*num,sum=0;
	while(s>0) {
		rem=s%10;
		s/=10;
		sum=sum+rem;
	}
	if(sum==num) {
		System.out.println("Neon Number");
	}
	else
	{
		System.out.println("Not a Neon Number");
	}
}
}
