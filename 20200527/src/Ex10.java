class B{
	private int num;

	public B(int num) {
		super();
		this.num = num;
	} //������ ct+sh+s+o

	@Override
	public boolean equals(Object obj) {
		if(this.num == ((B)obj).num) {
			return true;
		}
		else {
			return false;
		}
	} //�������̵� ct+sh+s+v
	
	
	
//	public boolean myEquals(Object b) {
////		B mb = (B)b; //������ ���, �ڽ��� �θ𿡰� ������ �� �ִ�
//		
//		if(this.num == ((B)b).num) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
}
public class Ex10 {
	Ex10(){
		B b1 = new B(10);
		B b2 = new B(10);
		B b3 = new B(20);
		
		
		
		System.out.println(b1.equals(b2)); 		//false �������̵� ���� true�� ��
//		System.out.println(b1.myEquals(b2));	//true
//		System.out.println(b1.myEquals(b3));	//false
	}
	public static void main(String[] args) {
		new Ex10();
	}
}
