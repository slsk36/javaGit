import java.util.Scanner;

/*
 * 정수 둘을 인자로 전달 받아서 두 수의 사칙연산 결과를 출력하는 메소드와 호출하는  main메소드 정의
 * 나눗셈은 몫과 나머지 각각 출력
 */
class Calcu{
	public void add(int a, int b) {
		System.out.println("a+b=" +(a+b));
	}
	public void sub(int a, int b) {
		System.out.println("a-b=" +(a-b));
	}
	public void mul(int a, int b) {
		System.out.println("axb=" +(a*b));
	}
	public void div(int a, int b) {
		System.out.println("a÷b=" +(a/b));
		System.out.println("나머지="+(a%b));
	}
	
	
}

public class Ex06_01 {
	public static void main(String[] args) {
//		Scanner scan= new Scanner(System.in);
//		int a;
//		int b;
//		
//		System.out.println("정수1 입력: ");
//		a=scan.nextInt();
//		System.out.println("정수2 입력: ");
//		b=scan.nextInt();
//		
//		System.out.println("a+b=" +(a+b));
//		System.out.println("a-b=" +(a-b));
//		System.out.println("axb=" +(a*b));
//		System.out.println("a÷b=" +(a/b));
//		System.out.println("나머지="+(a%b));
		
		while(true) {
			Calcu calcu = new Calcu();
			Scanner aaa = new Scanner(System.in);
			System.out.println("1.+ 2.- 3.x 4.÷,%");
			int select = aaa.nextInt();
			System.out.println("정수1");
			int a=aaa.nextInt();
			System.out.println("정수2");
			int b=aaa.nextInt();
		
		
			switch (select) {
			case 1:
				calcu.add(a,b);
				break;
			case 2:
				calcu.sub(a,b);
				break;
			case 3:
				calcu.mul(a,b);
				break;
			case 4:
				calcu.div(a,b);
				break;
				
			default:
				System.out.println("종료");
				break;
			}
		}
	}
}
