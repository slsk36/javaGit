
public class Ex03 {
	public static void main(String[] args) {
		doA();
		doA();
		doA();
		doB(1);
		doB(2);
		doB(3);
	}
	
	public static void doA() {
		System.out.println("doA �޼��� �Դϴ�.");
	}
	public static void doB(int ar) {
		System.out.println("ar=" +ar);
	}
}
