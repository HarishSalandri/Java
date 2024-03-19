package methods;

public class Circle {
	static double pi=3.14;
	double radius;
	public void  areaOfCircle() {
		System.out.println("Area Of Circle "+(this.radius*this.radius));
		
	}
	public static void main(String[] args) {
		Circle c=new Circle();
		c.radius=5.0;
		c.areaOfCircle();
	}
}
