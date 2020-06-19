/*
 * 메소드 연결
 */
class AA{
	String a = "abcd";
	
	public String returnA() {
		return a;
	}
}

public class Ex05 {
	
	public static void main(String[] args) {
		//String a = new AA().returnA().concat("cc");
		//연결해서 쓰기
		AA aa = new AA();
		String a = aa.returnA();
		a=a.concat("cc");
		//분리해서 쓰기
		System.out.println("a= " +a);
	}

}
