package programs;

public class StrongNumber {
public static void main(String[] args) {
	//strong number 145:-1!+4!+5!=145
	int num=145,rem,sum=0,fact,number=num;
	while(num>0) {
		rem=num%10;
		num/=10;
	fact=1;
	for(int i=1;i<=rem;i++) {
		fact=fact*i;	
	}	
	
	sum=sum+fact;
	
	}
	System.out.println(sum);
	if(number==sum) {
		System.out.println("Strong number");
	}else {
		System.out.println(" not a Strong number");
	}
}
}
