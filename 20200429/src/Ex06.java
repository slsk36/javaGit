import java.util.Scanner;

class ToBinary{ 
	public String doBinary(int tenNumber) {
		if(tenNumber == 0 || tenNumber ==1)
			return tenNumber+"";
		else
			return doBinary(tenNumber/2)+tenNumber%2;
	}
}
public class Ex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("10진수 입력");
		int a = scan.nextInt();
		ToBinary tb = new ToBinary();
		String bin = tb.doBinary(a);
		System.out.println("10진수 "+a+"는 2진수로 "+bin+"입니다.");
	}
}