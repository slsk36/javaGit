import java.util.Scanner;

/*
 * 인자로 십진수 정수를 전달받아서 이에 해당하는 이진수 표현을 출력하는 메소드를 재귀의 형태로 정의하고
 * 이를 호출하는 main 메소드를 정의해보자
 */
class ToBinary{
	public String doBinary(int ten) {
		if(ten ==0 || ten ==1)
			return ten+""; //리턴값을 문자열로 바꾼다
		else
			return doBinary(ten/2)+ten%2;
	}
}
public class Ex06_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("10진수입력");
		int a = scan.nextInt();
		ToBinary tb = new ToBinary();
		String bin = tb.doBinary(a);
		System.out.println(+a+"는 2진수로"+bin);
	}
//    public static void main(String[] args) {
//        int n;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("10진수입력");
//        n=scan.nextInt();
//    	toBinary(n);
//    }
//    
//    public static int toBinary(int n) {
//        if(n > 0) {
//            int bin = n % 2;
//            n /= 2;
//            
//            toBinary(n);
//            System.out.print(bin);
//        }
//        return 0;        
//    }
}
