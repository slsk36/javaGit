import java.math.BigDecimal;

class MyRapA{
	int a = 0;
	
	public MyRapA(int a) {
		//ctrl + shift + o 로 super자동생성
		super();
		this.a = a;
	}
	
	//비파괴적 함수
	public int doAdd(int b) {
		return this.a +b;
	}
	
	//파괴적 함수(스스로 파괴)
	public void doAdd1(int b) {
		this.a = this.a +b;
	}
}

//오차없는 실수표현을 위한 BigDecimal 클래스
public class Ex03 {
	Ex03(){
		MyRapA mra = new MyRapA(10);
		System.out.println(mra.doAdd(10)); //20
		mra.a=mra.doAdd(10);			   //이 코드가 누락되면 값은 10으로 출력
		System.out.println(mra.a); 		   //20
		
		mra.doAdd1(30);
		System.out.println(mra.a);
		
		double a = 0.1;
		for (int i = 0; i < 10; i++) {
			a +=0.1;
		}
		System.out.println(a); //1.1이 나와야하는데 1.099999 출력
		
		BigDecimal bd = new BigDecimal(0.1);
		for (int i = 0; i < 10; i++) {
			bd = bd.add(new BigDecimal(0.1)); //bd로 다시 담아줘야함 아니면 0.1이 출력됨,파괴적함수
		}
		System.out.println(bd); //
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
}
