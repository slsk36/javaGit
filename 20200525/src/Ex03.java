
public class Ex03 {
	
	public static void main(String[] args) {
		doA();
		System.out.println("��������");
		
	}
	
	private static void doA() {
		try {
		doB();
		}
		catch(Exception e){}
	}
	
	private static void doB() throws Exception {
		int a = 10;
		int b = 0;
		System.out.println(a/b);
		//�ҽ��� ���� �������� ������ ������ ���� ������ ����ֱ�
		throw new Exception("���� ����");
	}
}
