class SinusCap{
	void sniTake() {
		System.out.println("�๰");
	}
	void sneTake() {
		System.out.println("��ä��");
	}
	void snuTake() {
		System.out.println("�ڰ� ��");
	}
	
	void take() { //���� ������ �� ���� �޼ҵ�
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