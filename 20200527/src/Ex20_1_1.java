import java.util.Random;
import java.util.Scanner;

/*
 * ������ ����
 * ���α׷� ����ڷκ��� ������ ���� A�� Z�� �Է¹޴´�.
 * �׸��� A�� Z�� �����Ͽ� �� ���̿� �ִ� ���� 10���� �����Ͽ� ����ϴ� ���α׷� �ۼ�.
 */
public class Ex20_1_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� A: ");
		int A= scan.nextInt();
		
		System.out.println("���� Z: ");
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
