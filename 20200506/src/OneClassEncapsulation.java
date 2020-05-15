class SinusCap{
	void sniTake() {
		System.out.println("콧물");
	}
	void sneTake() {
		System.out.println("재채기");
	}
	void snuTake() {
		System.out.println("코가 뻥");
	}
	
	void take() { //약의 복용방법 및 순서 메소드
		sniTake();
		sneTake();
		snuTake();
	}
}

class ColdPatient{
	void takeSinus(SinusCap cap) {
		cap.take();
	}
}

class OneClassEncapsulation {
	public static void main(String[] args) {
		ColdPatient suf = new ColdPatient();
		suf.takeSinus(new SinusCap());
	}
}