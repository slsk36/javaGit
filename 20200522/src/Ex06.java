import java.util.InputMismatchException;
import java.util.Scanner;
//���� �� ���ܻ�Ȳ ǥ���ϱ�
//try catch�� ���ܻ�Ȳ�� �߻��ϴ��� �������ᰡ �ƴ� ���������.
//���� ������ �ӵ��� ������
public class Ex06 {

	Ex06(){
		try {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù��° �� �Է� : ");
		int a = scan.nextInt();
		
		System.out.println("�ι�° �� �Է� : ");
		int b = scan.nextInt();
		
		System.out.println("a/b= " +a/b);
		System.out.println("���� ����Ǿ����ϴ�.");
		scan.close();//���� ��Ʈ�� ���� �б� �Ӽ� ���
		}
		
		catch (ArithmeticException ae) {
			System.out.println("error");
			ae.printStackTrace(); //���ܻ�Ȳ�� ��� �߻��ߴ��� �α����
		}
		catch (InputMismatchException ie) {
			System.out.println("���ڿ� �Է� error");
		}
		
		
		System.out.println("����˴ϴ�.");
		
		
	}
	
	public static void main(String[] args) {
		new Ex06();
	}
}
