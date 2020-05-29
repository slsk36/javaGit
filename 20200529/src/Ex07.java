

//제네릭 메소드의 정의
class Box<T>{
	T t;

//	public T getT() {
//		return t;
//	}

	public void setT(T t) {
		this.t = t;
	}

//	public Box(T t) {
//		super();
//		this.t = t;
//	}
	
	@Override
	public String toString() {
		return "Box [t=" + t + "]";
	}
	
}

public class Ex07 {
	
	public static <T> Box<T> makeBox(T o){
		Box<T> box = new Box<T>();
		box.setT(o);
		return box;
	}
	
	
	public static void main(String[] args) {
		Box<String> bx1 = makeBox("test");
		Box<Integer> bx2 = makeBox(123);
		System.out.println(bx1);
		System.out.println(bx2);
	}
}
