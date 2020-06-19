/*
 * String 클래스의 활용
 * 다음 주민등록번호의 중간에 삽입된 -를 지우고 공백으로 채워서 출력하는 프로그램을 작성해 보자
 * 단 StringBuilder클래스를 활용하여 빈번한 문자열의 생성이 발생하지 않도록 해야한다.
 */
public class Ex11_2 {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("990925-1012999");
		
		str.replace(6, 7, " ");
		System.out.println(str.toString());
		
	}
}
