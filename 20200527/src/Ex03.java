import java.math.BigDecimal;

class MyRapA{
	int a = 0;
	
	public MyRapA(int a) {
		//ctrl + shift + o �� super�ڵ�����
		super();
		this.a = a;
	}
	
	//���ı��� �Լ�
	public int doAdd(int b) {
		return this.a +b;
	}
	
	//�ı��� �Լ�(������ �ı�)
	public void doAdd1(int b) {
		this.a = this.a +b;
	}
}

//�������� �Ǽ�ǥ���� ���� BigDecimal Ŭ����
public class Ex03 {
	Ex03(){
		MyRapA mra = new MyRapA(10);
		System.out.println(mra.doAdd(10)); //20
		mra.a=mra.doAdd(10);			   //�� �ڵ尡 �����Ǹ� ���� 10���� ���
		System.out.println(mra.a); 		   //20
		
		mra.doAdd1(30);
		System.out.println(mra.a);
		
		double a = 0.1;
		for (int i = 0; i < 10; i++) {
			a +=0.1;
		}
		System.out.println(a); //1.1�� ���;��ϴµ� 1.099999 ���
		
		BigDecimal bd = new BigDecimal(0.1);
		for (int i = 0; i < 10; i++) {
			bd = bd.add(new BigDecimal(0.1)); //bd�� �ٽ� �������� �ƴϸ� 0.1�� ��µ�,�ı����Լ�
		}
		System.out.println(bd); //
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
}
