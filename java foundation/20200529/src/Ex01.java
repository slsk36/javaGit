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
//}//������(��+��+s+o) tostring �޼���(��+��+s+s)�����ϱ�
//
//
//public class Ex01 {
//
//	public static void main(String[] args) {
//		AppleBox ab1 = new AppleBox(new Apple()); //�����ڸ� ���� �������� 
//		System.out.println(ab1);
//		OrangeBox ob1 = new OrangeBox(new Orange());
//		System.out.println(ob1);
//	}
//}
