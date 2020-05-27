import java.util.Random;
import java.util.Scanner;

/*
 * 난수의 생성
 * 프로그램 사용자로부터 임의의 정수 A와 Z를 입력받는다.
 * 그리고 A와 Z를 포함하여 그 사이에 있는 난수 10개를 생성하여 출력하는 프로그램 작성.
 */
public class Ex20_1_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 A: ");
		int A= scan.nextInt();
		
		System.out.println("정수 Z: ");
		int Z= scan.nextInt();
		
		int min,max;
		
		if(A>Z) {
			min = Z;
			max = A;
		}
		else {
			min = A;
			max = Z;
		}
		
		Random rand = new Random();
		int rn;
		
		for (int i = 0; i < 10; i++) {
			rn = min;
			rn += rand.nextInt(max-min + 1);
			System.out.println(rn);
		}
	}
}
