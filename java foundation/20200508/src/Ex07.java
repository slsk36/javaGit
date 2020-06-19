
public class Ex07 {

	Ex07(){
		doA();
		doA(1);
		doA(1,2);
	}
	private void doA(int i,int j) {
		System.out.println("i= "+i+" j= "+j);
	}
	private void doA(int i) {
		System.out.println("i= "+i);
	}
	private void doA() {
		System.out.println("doA 함수입니다");
	}
	public static void main(String[] args) {
		new Ex07();
	}
}
