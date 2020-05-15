import java.util.Scanner;
// 선생님 풀이
class ABS{
	public void doABS(int a,int b) {
		if(a>b)
			System.out.println("절대값 = "+(a-b));
		else
			System.out.println("절대값 = "+(b-a));
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수1");
		int num1 = scan.nextInt();
		System.out.println("정수2");
		int num2 = scan.nextInt();
		
		ABS abs = new ABS();
		abs.doABS(num1, num2);
	}
}
