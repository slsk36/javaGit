
public class Circle {
	double rad =0;
	final double PI = 3.14;
	
	public Circle(double r) {
		rad = r;
	}
	
	public double getArea() {
		return rad*rad*PI;
	}
	public void setRad(double r) {
		if(r<0) {
			rad = 0;
			return;
		}
		rad=r;
	}
	
	public static void main(String[] args) {
		Circle c = new Circle(1.5);
		System.out.println("반지름 "+c.rad+"인 원의 넓이는 "+c.getArea());
		
		c.setRad(2.5);
		System.out.println("반지름 2.5인 원의 넓이는 "+c.getArea());
	}
}
