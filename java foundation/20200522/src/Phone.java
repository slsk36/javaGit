
public interface Phone {
	public void recv();
	
}
interface newPhone extends Phone{
	public void send();
//	public void katok();
	default public void internet() {
		System.out.println("���ͳ� ����");
	}
//		�������̽��� �þ�� ������ �� �ʿ䰡 ���� default �����
	static public void kakao() {
		System.out.println("ī�� ����");
	}
}