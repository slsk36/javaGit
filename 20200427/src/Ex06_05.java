import java.util.Scanner;

/*
 * 인자로 정수를 전달받아서 2의 n승을 계산하여 반환하는 메소드를 재귀의 형태로 정의하고
 * 이를 호출하는 main 메소드를 정의해보자.
 */
class Power{
	public int power(int n) {
		if(n>0)
			return power(n-1)*2;
		else
			return 1;
	}
}
public class Ex06_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Power pp = new Power(); //memory 상에 올림
		System.out.println("n값");
		int n = scan.nextInt();
		int result = pp.power(n);
		System.out.println("2의 "+n+"승은 "+result);
	}
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n;
//		System.out.println("n값 입력");
//		n=scan.nextInt();
//		System.out.println("2의 n승=" +power(n));
//	}
//	public static int power(int n) {
//		if(n==0)
//			return 1;
//		return 2 * power(n-1);
//	}
}
