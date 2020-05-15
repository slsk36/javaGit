/*
 * 자연수 1부터 시작해서 모든 홀수를 더해 나간다. 그리고 그 합이 언제 1000을
 * 넘어서는지 그리고 1000을 넘어선 값은 얼마가 되는지 계산하여 출력
 */
public class Ex06 {
	public static void main(String[] args) {
		int a =1;
		int total = 0;
		
		while(true) {
			total += a;
			a=a+2;
			if(total > 1000)
				break;
		}
		
		System.out.println("total ="+total);
		System.out.println("a ="+a);
	}
}
