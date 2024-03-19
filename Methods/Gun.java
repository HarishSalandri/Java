package methods;

public class Gun {
	String name;
	int bullets;
	public  void shooting(){
		for(int i=1;i<=bullets;i++) {
			System.out.println("dishum, dishum");
		}
	}
	public static void main(String[] args) {
		Gun f=new Gun();
		f.name="rifil";
		f.bullets=6;
		f.shooting();
	}
}
