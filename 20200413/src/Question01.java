//문제1. int 형 변수에 각각 10,20,30이 저장된 상태에서 다음 문장을 실행하면 변수에는 각각 얼마가 저장?

public class Question01 {
	public static void main(String[] args) {
	int num1=10,num2=20,num3=30;
	num1=num2=num3;
	
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);
	}
}
