
public class Ex06 {

	public static void main(String[] args) {
		BankAccount ba1=new BankAccount();
		//ba1 �� �ܾ� Ȯ��
		ba1.chkMyBal();
		
		//ba1�� �Ա�
		ba1.depositMyBal(3000);
		ba1.chkMyBal();
		
		BankAccount ba2=new BankAccount();
		//ba2�� �ܾ� Ȯ��
		ba2.withdraw(3000);
		ba2.chkMyBal();
	}
}
