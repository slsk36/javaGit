import java.util.Scanner;

//°èÁÂ°ü¸® ÇÁ·Î±×·¥
class AccountBank{
	int myBal = 0;
	
	public void deposit(int input) {
		myBal+=input;
	}
}
public class Ex05 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int select = scan.nextInt();
		
		if (select==1) {
			
		} else if(select==2) {

		}
		
		AccountBank ab1 = new AccountBank();
		System.out.println("°ú°Å ÀÜ¾×="+ab1.myBal);
		
		ab1.deposit(3000);
		System.out.println("ÇöÀç ÀÜ¾×="+ab1.myBal);
		
		AccountBank ab2 = new AccountBank();
		System.out.println("°í°´ ÀÜ¾×="+ab2.myBal);
	}

}
