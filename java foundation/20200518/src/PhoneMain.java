interface Phone{
	public void call();
}

class SPhone implements Phone{
	@Override
	public void call() {
		System.out.println("�Ｚ������ ��ȭ");
	}
}

class LPhone implements Phone{
	@Override
	public void call() {
		System.out.println("LG������ ��ȭ");
	}
}

public class PhoneMain {
	
	public static void main(String[] args) {
		Phone p1 = new SPhone();
		p1.call();
		
		Phone p2 = new LPhone();
		p2.call();
	}
}
