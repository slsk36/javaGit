class GiaCar extends Car {
	GiaCar(){
		super();
	}//기본생성자 생략되어진 표현
	
	public void tellInfo() {
//		System.out.println("name= "+name);
		System.out.println("기아차");
		tellName();
	}
}

class SsangyoungCar extends Car{
	public void tellInfo() {
		System.out.println("쌍용");
		tellName();
	}
}

class SamsungCar extends Car{
	public void tellInfo() {
		System.out.println("삼성차");
		tellName();
	}
	
}
public class Car {
	String name;
	Car(){}
	Car(String name){
		this.name = name;
	}
//	String name;
	public void tellName() {
		System.out.println("name= "+name);
	}
}
