package cc.dd;

public class AA {
	public AA(){
		System.out.println("�⺻ ������ �����");
	}
	public static void main(String[] args) {
		
		AA aa1 = new AA();
		
		cc.dd.AA aa2 = new cc.dd.AA();
		aa2.doA();
	}
	
	public void doA() {
		System.out.println("cc.dd.AA.doA�޼��� �Դϴ�.");
	}

}
