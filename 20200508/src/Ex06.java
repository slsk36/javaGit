
class MyOut{
	static void doA() {
		System.out.println("MyOut doA �Լ��Դϴ�");
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
