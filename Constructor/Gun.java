package constructor;

public class Gun {
	String name;
	int bullets;
	public Gun(String name,int bullets) {
		this.name=name;
		this.bullets=bullets;
	}

	public  void shooting(){
		for(int i=1;i<=bullets;i++) {
			System.out.println(this.name+" dishum");
		}
	}
	public static void main(String[] args) {
		Gun g=new Gun("pisthol", 6);
		g.shooting();
		Gun g1=new Gun("ak47", 10);
		g1.shooting();
		
	}
}
