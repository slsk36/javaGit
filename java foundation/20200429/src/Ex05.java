import java.util.Scanner;

class Jae{
	public static int jae(int n) {
		if(n>0)
			return jae(n-1)*2;	// jae(2) * 2
								// jae(1) * 2 *2
								// jae(0) * 2 * 2 *2
								// 1*2*2*2
		else
			return 1;
	}
}
public class Ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		Jae aa = new Jae();
		System.out.println("몇 승 할래?");
		int num = scan.nextInt();
		
		int result = Jae.jae(num);
		System.out.println("2의 "+num+"승은 "+result+"입니다.");
		
	}
}