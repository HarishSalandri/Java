package methods;

public class Method8 {
	static int i=10;
	int j=20;
	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(Method8.i);
	
		Method8 m=new Method8();
		System.out.println(m.i);
		System.out.println(m.j);
		m.sleep();
	}
	public void sleep() {
		System.out.println(j);
		System.out.println(i);
		System.out.println(this.j);
		System.out.println(this.i);
		System.out.println(Method8.i);
	}
}
