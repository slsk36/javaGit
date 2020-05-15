import java.util.Scanner;

/*
 * 다음 main메소드와 함께 동작하는 Accumulator class를 정의하자. 그리고 Accumulator class에
 * main method를 넣어서 컴파일 및 실행을 하자
 * 실행 결과로, 즉 showResult 메소드의 호출 결과로 다음과 같은 수준의 출력을 보이면 된다.
 * sum = 45
 */


public class Accumulator {
	static int sum = 0;

    static void add(int n) {
        sum += n;
    }
    static void showResult() {
        System.out.println("누적값 sum = " +sum);
    }

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("누적 계산할 값 n= ");
    	int n = scan.nextInt();
        for(int i = 0; i <= n; i++)
        
            Accumulator.add(i);     // 전달되는 값을 모두 누적
        
        Accumulator.showResult();    // 최종 누적 결과를 출력
    }
}

