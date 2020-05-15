/*
 * 연습 문제6-2-1
 */
public class Ex09 {
	public static void main(String[] args) {
		System.out.println("round: " + round(2.8));
		System.out.println("area: " + area(2.8));
	}
	
	public static double round(double r) {
		final double pi=3.14;
		return r*r*pi;
	}
	public static double area(double r) {
		final double pi=3.14;
		return r*2*pi;
	}
}
