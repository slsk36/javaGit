//�������̽� ����� 3����
public class Ex03 {
	
	Ex03(){
		myInter mi = new myInter() {
			@Override
			public void doA() {
				System.out.println("mi �������̽�");
			}
		};
		
		doUseMyInter(new myInter() {
			@Override
			public void doA() {
				System.out.println("�͸� �������̽�");
			}
		});
		
		doUseMyInter(mi);
		doUseMyInter(()->{System.out.println("�����������̽�");} );
	}
	
	public void doUseMyInter(myInter myinter) {
		myinter.doA();
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
}
