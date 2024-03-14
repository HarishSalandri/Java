package programs;

public class Strong100to10000 {
public static void main(String[] args) {
	
	for(int i=100;i<=100000;i++) {
		int num=i,  rem=0,sum=0;
		
		while(num>0) {
		rem=num%10;
		
		
		int fact=1;
		for (int j=1;j<=rem;j++) {
			fact=fact*j;
			
		}
		sum=sum+fact;
		num/=10;
		}
		
		if(sum==i) {
			System.out.println(i);
		
	
		}
	}
}
}



