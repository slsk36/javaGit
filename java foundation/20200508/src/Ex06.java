
class MyOut{
	static void doA() {
		System.out.println("MyOut doA 함수입니다");
	}
}

class MySystem{
	static MyOut mout = new MyOut();
}

public class Ex06 {
	Ex06(){
		MySystem.mout.doA();
	}
	
	public static void main(String[] args) {
		new Ex06();
	}
}
