import java.util.Scanner;

/*
 * ���� ���� ���ڷ� ���޹޾Ƽ� �� ���� ���� ���밪�� ����Ͽ� ����ϴ� �޼ҵ�� �� �޼ҵ带 ȣ���ϴ� main �޼ҵ带 �����غ���
 * �� �޼ҵ� ȣ�� �� ���޵Ǵ� ���� ������ ������� ���� ���� ���ǰ� ��µǾ�� �Ѵ�.
 */
class ABS{
	public void doABS(int a,int b) {
		if (a>b) {
			System.out.println("���밪="+(a-b));
		} else {
			System.out.println("���밪="+(b-a));
		}
	}
}
public class Ex06_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����1 �Է�: ");
		int a=scan.nextInt();
		System.out.println("����2 �Է�: ");
		int b=scan.nextInt();
		
		ABS scan1 = new ABS();
		scan1.doABS(a,b);
		
	}
}
