//����Ŭ���� �޼ҵ�
public class Ex02 {
	Ex02(){
		Integer n1 = new Integer(10);
		Integer n2 = new Integer(3);
		
		System.out.println(Integer.max(n1, n2)); //�ִ밪
		System.out.println(Integer.min(n1, n2)); //�ּҰ�
		System.out.println(Integer.sum(n1, n2)); //�հ�
		
		System.out.println(Integer.toBinaryString(n1)); //2����
		System.out.println(Integer.toOctalString(n1)); //8����
		System.out.println(Integer.toHexString(n1)); //16����
		
		System.out.println("10�� ����ȯ�Ͽ� ���ڷ� �ֱ�");
		int a = Integer.parseInt("10");
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}
