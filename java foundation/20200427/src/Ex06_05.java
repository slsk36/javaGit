import java.util.Scanner;

/*
 * ���ڷ� ������ ���޹޾Ƽ� 2�� n���� ����Ͽ� ��ȯ�ϴ� �޼ҵ带 ����� ���·� �����ϰ�
 * �̸� ȣ���ϴ� main �޼ҵ带 �����غ���.
 */
class Power{
	public int power(int n) {
		if(n>0)
			return power(n-1)*2;
		else
			return 1;
	}
}
public class Ex06_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Power pp = new Power(); //memory �� �ø�
		System.out.println("n��");
		int n = scan.nextInt();
		int result = pp.power(n);
		System.out.println("2�� "+n+"���� "+result);
	}
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n;
//		System.out.println("n�� �Է�");
//		n=scan.nextInt();
//		System.out.println("2�� n��=" +power(n));
//	}
//	public static int power(int n) {
//		if(n==0)
//			return 1;
//		return 2 * power(n-1);
//	}
}
