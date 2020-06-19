/*
 * String 클래스의 활용
 * 다음 주민등록번호의 중간에 삽입된 -를 지우고 공백으로 채워서 출력하는 프로그램을 작성해 보자
 */
public class Ex11_1 {

	public static void main(String[] args) {
		String str = "990925-1012999";
		String str2 = str.substring(0,6);
//		System.out.println(str2);
		
		String str3 = str.substring(7);
//		System.out.println(str3);
		
		String str4 = str2.concat(" ").concat(str3);
		
		
		System.out.println(str4);
		System.out.println(str2+" "+str3);
	}
}
