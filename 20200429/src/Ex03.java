import java.util.Scanner;
// 선생님의 풀이
class Circle{
	public void doArea(int r) {
		System.out.println("원 넓이는 ="+(r*r*3.14));
	}
	public void doRound(int r) {
		System.out.println("원 둘레는 ="+(2*3.14*r));
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle circle = new Circle();
		
		System.out.println("원 바지름 입력");
		int num1 = scan.nextInt();
		
		circle.doArea(num1);
		circle.doRound(num1);
		
	}
}
