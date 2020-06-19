//래퍼클래스 메소드
public class Ex02 {
	Ex02(){
		Integer n1 = new Integer(10);
		Integer n2 = new Integer(3);
		
		System.out.println(Integer.max(n1, n2)); //최대값
		System.out.println(Integer.min(n1, n2)); //최소값
		System.out.println(Integer.sum(n1, n2)); //합계
		
		System.out.println(Integer.toBinaryString(n1)); //2진수
		System.out.println(Integer.toOctalString(n1)); //8진수
		System.out.println(Integer.toHexString(n1)); //16진수
		
		System.out.println("10을 형변환하여 숫자로 넣기");
		int a = Integer.parseInt("10");
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}
