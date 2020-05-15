/*
 *전달된 값이 소수인지 아닌지를 판단하여 소수인 경우 true 소수가 아닌 경우 false를 반환하는 메소드를 정의
 *이 메소드의 호출 결과를 기반으로 1이상 100이하의 소수를 전부 출력하는 main 메소드 정의
 */
class PrimeNumber{
	//a= 5 1,5로만 나누어 떨어짐 2개
	//b= 10 1,2,5,10으로 나누어 떨어짐 4개
	//나누어 떨어지는 수가 2개 초과이면 false로 만들어서 출력안함, 2개일때만 true로 출력하기
	
	public boolean doPrime(int a) {
		int cnt =0;
		
		for(int i=1; i<=a;i++) {
			if(a%i==0)
				cnt++;
		}
		if(cnt ==2)
			return true;
		else
			return false;
	}
}

public class Ex06_04 {
	public static void main(String[] args) {
		PrimeNumber num = new PrimeNumber();
		for(int i=1;i<100;i++) {
			if(num.doPrime(i))
				System.out.println(i);
		}
	}
	
//	public static boolean primeNumber(int num) {
//		if(num==1) 
//			return false;
//		for(int i=2;i<num;i++) {
//			if(num%i==0)
//				return false;
//		}
//		return true;
//	}
}
