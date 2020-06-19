class B{
	private int num;

	public B(int num) {
		super();
		this.num = num;
	} //생성자 ct+sh+s+o

	@Override
	public boolean equals(Object obj) {
		if(this.num == ((B)obj).num) {
			return true;
		}
		else {
			return false;
		}
	} //오버라이드 ct+sh+s+v
	
	
	
//	public boolean myEquals(Object b) {
////		B mb = (B)b; //다형성 기법, 자식은 부모에게 정의할 수 있다
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
		
		
		
		System.out.println(b1.equals(b2)); 		//false 오버라이드 쓰면 true가 됨
//		System.out.println(b1.myEquals(b2));	//true
//		System.out.println(b1.myEquals(b3));	//false
	}
	public static void main(String[] args) {
		new Ex10();
	}
}