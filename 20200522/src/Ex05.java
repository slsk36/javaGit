class LSPhone implements newPhone{
	@Override
	public void recv() {
		// TODO Auto-generated method stub
		System.out.println("전화 받기");
	}
	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("전화 걸기");
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
