import java.util.Scanner;
/*
 * ����2���� �Է¹޾� �� ���� �հ� ���� ����ϴ� �޼ҵ带 �ۼ��Ͽ� ����ϱ�
 * �������� �Է¹޾� �����̿� ���ѷ��� ����ϴ� �޼ҵ带 �ۼ��Ͽ� ����ϱ�
 */
class SC{
	static final double PI = 3.1415;
	
	static double add(double n1, double n2) {
		return n1+n2;
	}
	static double min (double n1, double n2) {
		return n1-n2;
	}
	static double calCircleArea(double r) {
		return PI * r*r;
	}
	static double calCirclePeri(double r) {
		return PI *(r*2);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� 2�� �Է�");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		
		System.out.println("n1+n2= " +SC.add(n1, n2));
		System.out.println("n1-n2= " +SC.min(n1, n2));
		
		System.out.println("������ �Է� ");
		double r = scan.nextDouble();
		
		System.out.println("������= " +SC.calCircleArea(r));
		System.out.println("���ѷ�= " +SC.calCirclePeri(r));
	}

}
