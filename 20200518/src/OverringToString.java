class Cake{
	//ToString �޼��� �������̵�
	@Override
	public String toString() {
		System.out.println(super.toString()); //�ּҰ�
		return "my cake";
	}
}

class CheeseCake extends Cake{
	@Override
	public String toString() {
		System.out.println(super.toString()); //�ּҰ�
		return "�� ���� ġ������ũ";
	}
}


public class OverringToString {

	public static void main(String[] args) {
		Cake c1 = new Cake();
		Cake c2 = new CheeseCake(); //������
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
