import java.util.Scanner;
//선생님의 풀이
class Calcu {
	// 더하기메서드
	public void doAdd(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}

	// 빼기 메서드
	public void doSub(int a, int b) {
		System.out.println(a + " - " + b + " = " + (a - b));
	}

	// 곱하기 메서드
	public void doMul(int a, int b) {
		System.out.println(a + " * " + b + " = " + (a * b));
	}

	// 나누기 메서드
	public void doDiv(int a, int b) {
		System.out.println(a + " / " + b + " = " + (a / b));
	}

	// 나머지 메서드
	public void doMod(int a, int b) {
		System.out.println(a + " % " + b + " = " + (a % b));
	}
}

public class Ex01 {

	public static void main(String[] args) {

		dowhile:while (true) {
			Calcu calcu = new Calcu();
			Scanner aaa = new Scanner(System.in);
			System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
			int select = aaa.nextInt();
			System.out.println("숫자 한개 입력 : ");
			int num1 =aaa.nextInt();
			System.out.println("숫자 한개 입력 : ");
			int num2 =aaa.nextInt();
			
			switch (select) {
			case 1:
				calcu.doAdd(num1, num2);
				break;
			case 2:
				calcu.doSub(num1, num2);
				break;
			case 3:
				calcu.doMul(num1, num2);
				break;
			case 4:
				calcu.doDiv(num1, num2);
				break;
			case 5:
				calcu.doMod(num1, num2);
				break;
			default:
				System.out.println("종료합니다.");
				break dowhile;
			}

		}

	}

}