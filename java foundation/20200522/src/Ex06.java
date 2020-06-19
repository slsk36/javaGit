import java.util.InputMismatchException;
import java.util.Scanner;
//에러 및 예외상황 표시하기
//try catch로 예외상황이 발생하더라도 강제종료가 아닌 정상종료됨.
//많이 쓸수록 속도가 느려짐
public class Ex06 {

	Ex06(){
		try {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 수 입력 : ");
		int a = scan.nextInt();
		
		System.out.println("두번째 수 입력 : ");
		int b = scan.nextInt();
		
		System.out.println("a/b= " +a/b);
		System.out.println("정상 연산되었습니다.");
		scan.close();//연결 스트림 끊기 읽기 속성 취소
		}
		
		catch (ArithmeticException ae) {
			System.out.println("error");
			ae.printStackTrace(); //예외상황이 어떻게 발생했는지 로그출력
		}
		catch (InputMismatchException ie) {
			System.out.println("문자열 입력 error");
		}
		
		
		System.out.println("종료됩니다.");
		
		
	}
	
	public static void main(String[] args) {
		new Ex06();
	}
}
