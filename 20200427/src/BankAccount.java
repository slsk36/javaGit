/* �ܾ� myBal
 * ����Ȯ�� chkMyBal
 * �����Ա� depositMyBal
 * ������� withdraw
 */

public class BankAccount {
	int myBal;
	/**
	 * �ܾ�Ȯ��
	 */
	public void chkMyBal() {
		System.out.println("�ܾ�:"+myBal);
	}
	
	public void depositMyBal(int in) {
		myBal += in;
		System.out.println(in+"�� �Ա��߽��ϴ�.");
	}
	
	public void withdraw(int out) {
		if(myBal < out) {
			System.out.println("��ݽ���/�ܾ׺���");
			return;
		}
		myBal -= out;
		System.out.println(out+"�� ����߽��ϴ�.");
	}
	
}
