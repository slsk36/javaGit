//문제5. n1,n2,n3 가 다음과 같을 때 n1>n2>n3이면 true, 아니면 false

public class Question05 {
	public static void main(String[] args) {
		int n1= ((25+5)+(36/4)-72)*5;
		int n2= ((25*5)+(36/4)+72)/4;
		int n3= (128/4)*2;
		boolean result = (n1>n2) && (n2>n3);
		
		System.out.println(result);
	}
}
