

public class Ex09 {

	int a = 10;
	int b = 20;
	
	Ex09(){
		System.out.println("�⺻������");
	}
	Ex09(int aa){
		this(); //�ٷ����� �����ڸ� ȣ���Ѵ�.
		System.out.println("�Ķ���� �Ѱ��� �ִ� ������");
		a=aa;
	}
	Ex09(int aa,int bb){
		this(aa);
		System.out.println("�Ķ���� �ΰ��� �ִ� ������");
		b=bb;
	}
	public void doPrint() {
		System.out.println("a= "+a+" b ="+b+"\n");
		
	}
	public static void main(String[] args) {
		Ex09 ex1 = new Ex09();
		Ex09 ex2 = new Ex09(11);
		Ex09 ex3 = new Ex09(12,22);
		ex1.doPrint();
		ex2.doPrint();
		ex3.doPrint();
		
	}
}
