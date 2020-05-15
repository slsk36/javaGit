import java.util.Scanner;

/*
 * 숫자 2개를 입력받아서 두 수가 같은지 확인하기
 */
public class Ex03 {
	
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 입력하세요");
		int a = scan.nextInt();
		System.out.println("숫자 입력하세요");
		int b = scan.nextInt();
		
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		
		if(a>b) {
			System.out.println("a가 큼");
		}
		else if(a<b) {
			System.out.println("b가 큼");
		}else {
			System.out.println("a와b가 같음");
		}
	}
}
