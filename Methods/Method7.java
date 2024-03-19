package methods;

public class Method7 {
	//the first 3 digits from given number 98632145
	public static int rev(int n) {
		int rev=0, r;
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n/=10;
			
		}
		return rev;
	}
public static void main(String[] args) {
	int n=98632145,res=0,num=rev(n);
	for(int i=1;i<=3;i++) {
		int r=num%10;
		res=res*10+r;
		num/=10;
	}
	System.out.println(res);
}
}
