
public class Ex06 {

	public static void main(String[] args) {
		BankAccount ba1=new BankAccount();
		//ba1 의 잔액 확인
		ba1.chkMyBal();
		
		//ba1의 입금
		ba1.depositMyBal(3000);
		ba1.chkMyBal();
		
		BankAccount ba2=new BankAccount();
		//ba2의 잔액 확인
		ba2.withdraw(3000);
		ba2.chkMyBal();
	}
}
