import java.util.Scanner;

/*
 * 정수 둘을 인자로 전달받아서 두 수의 차의 절대값을 계산하여 출력하는 메소드와 이 메소드를 호출하는 main 메소드를 정의해보자
 * 단 메소드 호출 시 전달되는 값의 순서에 상관없이 절대 값이 계산되고 출력되어야 한다.
 */
class ABS{
	public void doABS(int a,int b) {
		if (a>b) {
			System.out.println("절대값="+(a-b));
		} else {
			System.out.println("절대값="+(b-a));
		}
	}
}
public class Ex06_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수1 입력: ");
		int a=scan.nextInt();
		System.out.println("정수2 입력: ");
		int b=scan.nextInt();
		
		ABS scan1 = new ABS();
		scan1.doABS(a,b);
		
	}
}
