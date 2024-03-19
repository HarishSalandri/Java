package methods;

public class Rectangle {
	double length;
	double width;
	public void areaOfRectangle() {
		System.out.println("Area Of Rectangle "+this.length*this.width);
		
	}
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.length=5.0;
		r.width=3.0;
		r.areaOfRectangle();
	}
	
}
