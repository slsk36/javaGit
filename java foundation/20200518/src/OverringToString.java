class Cake{
	//ToString 메서드 오버라이딩
	@Override
	public String toString() {
		System.out.println(super.toString()); //주소값
		return "my cake";
	}
}

class CheeseCake extends Cake{
	@Override
	public String toString() {
		System.out.println(super.toString()); //주소값
		return "내 생일 치즈케이크";
	}
}


public class OverringToString {

	public static void main(String[] args) {
		Cake c1 = new Cake();
		Cake c2 = new CheeseCake(); //다형성
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
