import java.util.Scanner;
//�������� Ǯ��
class Calcu {
	// ���ϱ�޼���
	public void doAdd(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}

	// ���� �޼���
	public void doSub(int a, int b) {
		System.out.println(a + " - " + b + " = " + (a - b));
	}

	// ���ϱ� �޼���
	public void doMul(int a, int b) {
		System.out.println(a + " * " + b + " = " + (a * b));
	}

	// ������ �޼���
	public void doDiv(int a, int b) {
		System.out.println(a + " / " + b + " = " + (a / b));
	}

	// ������ �޼���
	public void doMod(int a, int b) {
		System.out.println(a + " % " + b + " = " + (a % b));
	}
}

public class Ex01 {

	public static void main(String[] args) {

		dowhile:while (true) {
			Calcu calcu = new Calcu();
			Scanner aaa = new Scanner(System.in);
			System.out.println("1.���ϱ� 2.���� 3.���ϱ� 4.������ 5.������");
			int select = aaa.nextInt();
			System.out.println("���� �Ѱ� �Է� : ");
			int num1 =aaa.nextInt();
			System.out.println("���� �Ѱ� �Է� : ");
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
				System.out.println("�����մϴ�.");
				break dowhile;
			}

		}

	}

}