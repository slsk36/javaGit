import java.util.Scanner;

/*
 * ���ڷ� ������ ������ ���޹޾Ƽ� �̿� �ش��ϴ� ������ ǥ���� ����ϴ� �޼ҵ带 ����� ���·� �����ϰ�
 * �̸� ȣ���ϴ� main �޼ҵ带 �����غ���
 */
class ToBinary{
	public String doBinary(int ten) {
		if(ten ==0 || ten ==1)
			return ten+""; //���ϰ��� ���ڿ��� �ٲ۴�
		else
			return doBinary(ten/2)+ten%2;
	}
}
public class Ex06_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("10�����Է�");
		int a = scan.nextInt();
		ToBinary tb = new ToBinary();
		String bin = tb.doBinary(a);
		System.out.println(+a+"�� 2������"+bin);
	}
//    public static void main(String[] args) {
//        int n;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("10�����Է�");
//        n=scan.nextInt();
//    	toBinary(n);
//    }
//    
//    public static int toBinary(int n) {
//        if(n > 0) {
//            int bin = n % 2;
//            n /= 2;
//            
//            toBinary(n);
//            System.out.print(bin);
//        }
//        return 0;        
//    }
}
