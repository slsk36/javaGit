
public interface Phone {
	public void recv();
	
}
interface newPhone extends Phone{
	public void send();
//	public void katok();
	default public void internet() {
		System.out.println("인터넷 가능");
	}
//		인터페이스가 늘어나도 재정의 할 필요가 없는 default 예약어
	static public void kakao() {
		System.out.println("카톡 가능");
	}
}