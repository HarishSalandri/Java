package programs;

public class Perfect {
public static void main(String[] args) {
	//6,28,496 ex-28/1,2,4,7,14=1+2+4+7+14
	int num=496,sum=0;
	for(int i=1;i<=num/2;i++) {
		if(num%i==0) {
		sum+=i;	
		}
			}
	System.out.println(sum);
	if(num==sum) {
		System.out.println("Perfect number");
	}
	else {
		System.out.println("Not Perfect number");
	}
}
}
