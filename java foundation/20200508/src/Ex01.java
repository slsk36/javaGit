import java.util.Scanner;
/*
 * 정수2개를 입력받아 두 값의 합과 차를 계산하는 메소드를 작성하여 출력하기
 * 반지름을 입력받아 원넓이와 원둘레를 계산하는 메소드를 작성하여 출력하기
 */
class SC{
	static final double PI = 3.1415;
	
	static double add(double n1, double n2) {
		return n1+n2;
	}
	static double min (double n1, double n2) {
		return n1-n2;
	}
	static double calCircleArea(double r) {
		return PI * r*r;
	}
	static double calCirclePeri(double r) {
		return PI *(r*2);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 2개 입력");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		
		System.out.println("n1+n2= " +SC.add(n1, n2));
		System.out.println("n1-n2= " +SC.min(n1, n2));
		
		System.out.println("반지름 입력 ");
		double r = scan.nextDouble();
		
		System.out.println("원넓이= " +SC.calCircleArea(r));
		System.out.println("원둘레= " +SC.calCirclePeri(r));
	}

}
