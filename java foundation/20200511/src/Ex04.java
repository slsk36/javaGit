/*
 *String의 문자열 메모리 주소 참조 확인
 */
public class Ex04 {

		public static void main(String[] args) {
			
			String a ="abcd";
			String b ="abcd";
			
			String c = new String("abcd");
			String d = new String("abcd");
			
			if(a==b){
				System.out.println("a=b같은 메모리주소 참조");
			}else {
				System.out.println("a≠b다른 메모리주소 참조");
			}
			if(c==d) {
				System.out.println("a=b같은 메모리주소 참조");
			}else {
				System.out.println("a≠b다른 메모리주소 참조");
			}
			
			if(c.equals(d)) {
				System.out.println("같다");
			}else {
				System.out.println("다르다");
			}
			
			double doublea = 10.23;
			//String stringa = doublea+"";
			String stringa = String.valueOf(doublea);
			
		}
}
