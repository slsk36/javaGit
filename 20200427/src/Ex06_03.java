import java.util.Scanner;

/*
 * 인자로 원의 반지름 정보를 전달하면, 원의 넓이를 계산해서 반환하는 메소드와 원의 둘레를 계산해서
 * 반환하는 메소드를 각각 정의하고 이 둘을 호출하는  main 메소드를 정의하자.
 */

class Circle{
	public void doArea(int r) {
		System.out.println("원넓이="+(r*r*3.14));
	}
	public void doRound(int r) {
		System.out.println("원둘레="+(r*2*3.14));
	}
}
public class Ex06_03 {
//	public static void main(String[] args) {
//		double r;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("반지름 입력");
//		r=scan.nextDouble();
//		
//		System.out.println("round= "+round(r));
//		System.out.println("area= "+area(r));
//	}
//	
//	public static double round(double r) {
//		return (r*r*3.14);
//	}
//
//	public static double area(double r) {
//		return (r*2*3.14);
//	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle circle = new Circle();
		
		System.out.println("반지름 입력: ");
		int r = scan.nextInt();
		
		circle.doArea(r);
		circle.doRound(r);
	}
}