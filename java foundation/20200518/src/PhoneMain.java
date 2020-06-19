interface Phone{
	public void call();
}

class SPhone implements Phone{
	@Override
	public void call() {
		System.out.println("삼성폰으로 전화");
	}
}

class LPhone implements Phone{
	@Override
	public void call() {
		System.out.println("LG폰으로 전화");
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
