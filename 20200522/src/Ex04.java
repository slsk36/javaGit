import aa.bb.Myinterface;

class MyConstant{ //ù��° ������
	public static final String DB_URL="192.168.0.198";
	public static final String DB_USER="hr";
	public static final String DB_PASS="1234";
}

interface MyVari{ //�ι�° ������
	String DB_URL="192.168.0.198";
	String DB_USER="hr";
	String DB_PASS="1234";
}


public class Ex04 {
	Ex04(){
		System.out.println(Myinterface.AA);
		System.out.println(Myinterface.BB);
		
		//Myinterface.AA = 30; //��üȭ�� ���ؼ� �� ����Ұ�!! final�̱� ����
		
		Myinterface mf = new Myinterface() {
			
			@Override
			public void doMyinterface() {
				// public�� �������� �ʾ����� �ڵ����� ����
				System.out.println("test");
				
			}
		};
		
		mf.doMyinterface();
	}
	public static void main(String[] args) {
		new Ex04();
	}
}
