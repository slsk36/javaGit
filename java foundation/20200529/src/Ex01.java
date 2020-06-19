////Generics
//class Apple{
//	@Override
//	public String toString() {
//		return "Apple";
//	}
//}
//
//class Orange{
//	@Override
//	public String toString() {
//		return "Orange";
//	}
//}
//class AppleBox{
////	String name;
//	Apple apple;
//	public AppleBox(Apple apple) {
//		super();
//		this.apple = apple;
//	}
//
//	@Override
//	public String toString() {
//		return "AppleBox [name=" + apple + "]";
//	}
//}
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
//
//
//public class Ex01 {
//
//	public static void main(String[] args) {
//		AppleBox ab1 = new AppleBox(new Apple()); //생성자를 만들어서 쓸수있음 
//		System.out.println(ab1);
//		OrangeBox ob1 = new OrangeBox(new Orange());
//		System.out.println(ob1);
//	}
//}
