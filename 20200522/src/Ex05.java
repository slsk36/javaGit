class LSPhone implements newPhone{
	@Override
	public void recv() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ �ޱ�");
	}
	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ �ɱ�");
	}
}

public class Ex05 {
	Ex05(){
		newPhone.kakao();
		
		LPhone lp = new LPhone();
		lp.recv();
		SPhone sp = new SPhone();
		sp.recv();
		
		LSPhone lsp = new LSPhone();
		lsp.recv();
		lsp.send();
		lsp.internet();
	}
	
	public static void main(String[] args) {
		new Ex05();
	}
}
