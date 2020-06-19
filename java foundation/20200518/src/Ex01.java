interface A{
	public void doA();
}

interface B{
	public void doB();
}

public class Ex01 implements A,B {

	@Override
	public void doA(){
		System.out.println("doA");
	}
	@Override
	public void doB(){
		System.out.println("doB");
	}
//	다중상속이 가능하다
	Ex01(){
		doA();
	}
	public static void main(String[] args) {
		new Ex01();
		System.out.println();
		Ex01 ex01 = new Ex01();
		ex01.doA();
	}
}
