import java.util.Scanner;

/*
 * ���� ���� ���ڷ� ���� �޾Ƽ� �� ���� ��Ģ���� ����� ����ϴ� �޼ҵ�� ȣ���ϴ�  main�޼ҵ� ����
 * �������� ��� ������ ���� ���
 */
class Calcu{
	public void add(int a, int b) {
		System.out.println("a+b=" +(a+b));
	}
	public void sub(int a, int b) {
		System.out.println("a-b=" +(a-b));
	}
	public void mul(int a, int b) {
		System.out.println("axb=" +(a*b));
	}
	public void div(int a, int b) {
		System.out.println("a��b=" +(a/b));
		System.out.println("������="+(a%b));
	}
	
	
}

public class Ex06_01 {
	public static void main(String[] args) {
//		Scanner scan= new Scanner(System.in);
//		int a;
//		int b;
//		
//		System.out.println("����1 �Է�: ");
//		a=scan.nextInt();
//		System.out.println("����2 �Է�: ");
//		b=scan.nextInt();
//		
//		System.out.println("a+b=" +(a+b));
//		System.out.println("a-b=" +(a-b));
//		System.out.println("axb=" +(a*b));
//		System.out.println("a��b=" +(a/b));
//		System.out.println("������="+(a%b));
		
		while(true) {
			Calcu calcu = new Calcu();
			Scanner aaa = new Scanner(System.in);
			System.out.println("1.+ 2.- 3.x 4.��,%");
			int select = aaa.nextInt();
			System.out.println("����1");
			int a=aaa.nextInt();
			System.out.println("����2");
			int b=aaa.nextInt();
		
		
			switch (select) {
			case 1:
				calcu.add(a,b);
				break;
			case 2:
				calcu.sub(a,b);
				break;
			case 3:
				calcu.mul(a,b);
				break;
			case 4:
				calcu.div(a,b);
				break;
				
			default:
				System.out.println("����");
				break;
			}
		}
	}
}
