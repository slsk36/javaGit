import java.util.Scanner;
// �������� Ǯ��
class Circle{
	public void doArea(int r) {
		System.out.println("�� ���̴� ="+(r*r*3.14));
	}
	public void doRound(int r) {
		System.out.println("�� �ѷ��� ="+(2*3.14*r));
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle circle = new Circle();
		
		System.out.println("�� ������ �Է�");
		int num1 = scan.nextInt();
		
		circle.doArea(num1);
		circle.doRound(num1);
		
	}
}
