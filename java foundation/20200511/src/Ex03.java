/*
 * String 클래스 예제
 */
public class Ex03 {
	
	Ex03(){
		String a="MyStringa";
		String b="MyStringb";
		
		System.out.println("a.charAt(0) = " +a.charAt(0));
		System.out.println("a.charAt(1) = " +a.charAt(1));
		
		System.out.println(a.equals("MyStringa"));
		//a == "MyStringa" 이런식으로 사용하지 말것 간헐적으로 오류발생
		System.out.println();
		String split_ = "a,b,c,d,e";
		String[] split = split_.split(",");//,를 기준으로 나누어짐
		for( String temp:split) {
			System.out.println("temp= "+temp);
		}
		System.out.println();
		
		System.out.println(a);
		System.out.println(a.length());
		System.out.println();
		
		System.out.println(b);
		System.out.println(b.length());
		System.out.println();
		
		showString("MyStringC");
	}
	
	public void showString(String c) {
		System.out.println(c);
		System.out.println(c.length());
		System.out.println();
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
}
