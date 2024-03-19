package constructor;

public class Circle {
	static double pi=3.14;
	double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	public void areaOfCircle() {
		System.out.println("Area Of Circle "+(this.radius*this.radius));
	}
	public static void main(String[] args) {
		Circle c=new Circle(3.0);
		c.areaOfCircle();
	}
}
