import java.util.Scanner;

/*
 * ���ڷ� ���� ������ ������ �����ϸ�, ���� ���̸� ����ؼ� ��ȯ�ϴ� �޼ҵ�� ���� �ѷ��� ����ؼ�
 * ��ȯ�ϴ� �޼ҵ带 ���� �����ϰ� �� ���� ȣ���ϴ�  main �޼ҵ带 ��������.
 */

class Circle{
	public void doArea(int r) {
		System.out.println("������="+(r*r*3.14));
	}
	public void doRound(int r) {
		System.out.println("���ѷ�="+(r*2*3.14));
	}
}
public class Ex06_03 {
//	public static void main(String[] args) {
//		double r;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("������ �Է�");
//		r=scan.nextDouble();
//		
//		System.out.println("round= "+round(r));
//		System.out.println("area= "+area(r));
//	}
//	
//	public static double round(double r) {
//		return (r*r*3.14);
//	}
//
//	public static double area(double r) {
//		return (r*2*3.14);
//	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle circle = new Circle();
		
		System.out.println("������ �Է�: ");
		int r = scan.nextInt();
		
		circle.doArea(r);
		circle.doRound(r);
	}
}