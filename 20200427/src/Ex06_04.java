/*
 *���޵� ���� �Ҽ����� �ƴ����� �Ǵ��Ͽ� �Ҽ��� ��� true �Ҽ��� �ƴ� ��� false�� ��ȯ�ϴ� �޼ҵ带 ����
 *�� �޼ҵ��� ȣ�� ����� ������� 1�̻� 100������ �Ҽ��� ���� ����ϴ� main �޼ҵ� ����
 */
class PrimeNumber{
	//a= 5 1,5�θ� ������ ������ 2��
	//b= 10 1,2,5,10���� ������ ������ 4��
	//������ �������� ���� 2�� �ʰ��̸� false�� ���� ��¾���, 2���϶��� true�� ����ϱ�
	
	public boolean doPrime(int a) {
		int cnt =0;
		
		for(int i=1; i<=a;i++) {
			if(a%i==0)
				cnt++;
		}
		if(cnt ==2)
			return true;
		else
			return false;
	}
}

public class Ex06_04 {
	public static void main(String[] args) {
		PrimeNumber num = new PrimeNumber();
		for(int i=1;i<100;i++) {
			if(num.doPrime(i))
				System.out.println(i);
		}
	}
	
//	public static boolean primeNumber(int num) {
//		if(num==1) 
//			return false;
//		for(int i=2;i<num;i++) {
//			if(num%i==0)
//				return false;
//		}
//		return true;
//	}
}
