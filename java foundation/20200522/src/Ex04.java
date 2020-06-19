import aa.bb.Myinterface;

class MyConstant{ //첫번째 선언방법
	public static final String DB_URL="192.168.0.198";
	public static final String DB_USER="hr";
	public static final String DB_PASS="1234";
}

interface MyVari{ //두번째 선언방법
	String DB_URL="192.168.0.198";
	String DB_USER="hr";
	String DB_PASS="1234";
}


public class Ex04 {
	Ex04(){
		System.out.println(Myinterface.AA);
		System.out.println(Myinterface.BB);
		
		//Myinterface.AA = 30; //객체화를 안해서 값 변경불가!! final이기 때문
		
		Myinterface mf = new Myinterface() {
			
			@Override
			public void doMyinterface() {
				// public을 선언하지 않았지만 자동으로 삽입
				System.out.println("test");
				
			}
		};
		
		mf.doMyinterface();
	}
	public static void main(String[] args) {
		new Ex04();
	}
}
