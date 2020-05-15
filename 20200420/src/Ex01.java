import java.util.Scanner;
public class Ex01 {
			
		public static void main(String[] args) {
			
			int a = 10;
			int b = 20;
			System.out.println("a= " +a);
			System.out.println("b= " +b);
			
			System.out.println("input");
			Scanner scan = new Scanner(System.in);
			String inputValue = scan.nextLine();
			System.out.println("inputValue= "+inputValue);
			
		}
	}

/* debug 이클립스에서 사용하는 개발자 개발도구
 * f6 라인진행
 * f8 디버그 종료, 다음 브레이크 포인트까지 진행
// * cmd에서 javac명령어로 컴파일 가능
 */
 