/*
 * ��Ӱ� ������: ����Ŭ������ ������ ȣ������
 */
class A{
	A(){
		System.out.println("AŬ���� ������");
	}
}

class B extends A{
	B(){
		super(); //�����Ǿ��� ������
		System.out.println("BŬ���� ������");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		new B();
	}
}
