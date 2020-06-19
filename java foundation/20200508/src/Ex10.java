
public class Ex10 {
	private int a = 10;
	
	public Ex10(int a) {
		this.a = a;
	}
	
	public void showA() {
		System.out.println("a= "+a);
	}
	public static void main(String[] args) {
		Ex10 ex10 = new Ex10(20);
		ex10.showA();
	}
}
