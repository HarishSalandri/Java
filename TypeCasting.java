package Java;

public class TypeCasting {
public static void main(String[] args) {
	//auto widening
	byte b=10;
	short s=b;
	int i=454;
	long l=34534544l;
	float f=l;
	double d=22.33;
	char c='s';
	boolean bl=true;
	System.out.println(b+" "+s);
	System.out.println(i+" "+l);
	System.out.println(f);
	System.out.println(d);
	System.out.println(c);
	System.out.println(bl);
	//explicit narrowing
	long ll=5545454;
	short s1=(short)l;
	byte b1=(byte)ll;
	System.out.println(b1);
	System.out.println(s1);
	
	
	
	
}
}
