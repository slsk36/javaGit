//Generics
class Apple{
	@Override
	public String toString() {
		return "Apple";
	}
}

class Orange{
	@Override
	public String toString() {
		return "Orange";
	}
}
//class FruitBox{
////	String name;
//	Object object;
//	public FruitBox(Object obj) {
//		super();
//		this.object = obj;
//	}
//
//	@Override
//	public String toString() {
//		return "AppleBox [name=" + object + "]";
//	}
//}

class FruitBox<T>{
//	String name;
	T object;
	public FruitBox(T obj) {
		super();
		this.object = obj;
	}

	@Override
	public String toString() {
		return "AppleBox [name=" + object + "]";
	}
}

//class OrangeBox{
////	String name;
//	Orange orange;
//	public OrangeBox(Orange orange) {
//		super();
//		this.orange = orange;
//	}
//
//	@Override
//	public String toString() {
//		return "OrangeBox [name=" + orange + "]";
//	}
//}//생성자(컨+쉬+s+o) tostring 메서드(컨+쉬+s+s)생성하기


public class Ex02 {

	public static void main(String[] args) {
		FruitBox fb1 = new FruitBox<Apple>(new Apple()); //생성자를 만들어서 쓸수있음 
		System.out.println(fb1);
		FruitBox fb2 = new FruitBox<Orange>(new Orange());
		System.out.println(fb2);
	}
}
