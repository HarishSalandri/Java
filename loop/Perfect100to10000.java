package programs;

public class Perfect100to10000 {
	
	//perfect
public static void main(String[] args) {
	
	for(int num=100;num<=10000;num++) {
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
			
		}
		if(sum==num) {
			System.out.println(num);
		}
			
		}
	}
}

