import java.util.Scanner;

/*
 * ���� 2���� �Է¹޾Ƽ� �� ���� ������ Ȯ���ϱ�
 */
public class Ex03 {
	
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���");
		int a = scan.nextInt();
		System.out.println("���� �Է��ϼ���");
		int b = scan.nextInt();
		
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		
		if(a>b) {
			System.out.println("a�� ŭ");
		}
		else if(a<b) {
			System.out.println("b�� ŭ");
		}else {
			System.out.println("a��b�� ����");
		}
	}
}
