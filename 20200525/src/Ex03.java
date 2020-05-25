
public class Ex03 {
	
	public static void main(String[] args) {
		doA();
		System.out.println("정상종료");
		
	}
	
	private static void doA() {
		try {
		doB();
		}
		catch(Exception e){}
	}
	
	private static void doB() throws Exception {
		int a = 10;
		int b = 0;
		System.out.println(a/b);
		//소스상에 예외 빨간줄이 나오기 때문에 예외 무조건 잡아주기
		throw new Exception("만든 예외");
	}
}
