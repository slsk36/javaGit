//�������̽�
interface myInter{
	public void doA();
}

public class Ex02 implements myInter {
	Ex02(){
		doA();
	}
	
	@Override
	public void doA() {
		System.out.println("�������̽� ȣ��");
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}
