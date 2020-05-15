/*
 * 상속과 생성자: 상위클래스의 생성자 호출지정
 */
class A{
	A(){
		System.out.println("A클래스 생성자");
	}
}

class B extends A{
	B(){
		super(); //생략되어진 생성자
		System.out.println("B클래스 생성자");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		new B();
	}
}
