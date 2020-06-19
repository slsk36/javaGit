//단순한 인맥관리 프로그램  배열과 상속

class Friend{
	protected String name;
	protected String phone;
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public void showInfo() {
		System.out.println("이름=" +this.name);
		System.out.println("번호=" +this.phone);
	}
}


class UnivFriend extends Friend{
//	private String name;
	private String major;
//	private String phone;
//	alt+shift+o 생성자
	public UnivFriend(String name, String major, String phone) {
		super(name,phone);
//		this.name=na;
		this.major=major;
//		this.phone=ph;
	}
	public void showInfo() {
		super.showInfo(); //자식에서 상위에 해당되는 클래스 출력됨
//		System.out.println("이름=" +this.name);
		System.out.println("전공=" +this.major);
//		System.out.println("번호=" +this.phone);
	}
}

class CompFriend extends Friend{
//	private String name;
	private String department;
//	private String phone;
	//alt+shifts =>o 생성자
	public CompFriend(String name, String department, String phone) {
		super(name,phone);
//		this.name=na;
		this.department=department;
//		this.phone=ph;
	}
	public void showInfo() {
		super.showInfo();
//		System.out.println("이름=" +this.name);
		System.out.println("전공=" +this.department);
//		System.out.println("번호=" +this.phone);
	}
}

public class MyFreinds {
	public static void main(String[] args) {
		
		Friend[] fri = new Friend[10]; //Friend 객체를 10개 만듦
		int fcnt = 0;
		fri[fcnt++] = new UnivFriend("aaa", "com", "012");
		fri[fcnt++] = new UnivFriend("bbb", "com", "1234");
		fri[fcnt++] = new UnivFriend("ccc", "com", "12345");
		fri[fcnt++] = new UnivFriend("ddd", "com", "123456");
		
		for (int i = 0; i < fcnt; i++) {
			fri[i].showInfo();
			System.out.println();
		}
		
//		UnivFriend[] univ = new UnivFriend[5];
//		univ[0] = new UnivFriend("aaa", "bbb", "0")
//		int ucnt = 0;
//		
//		univ[ucnt++] = new UnivFriend("홍", "컴공", "010");
//		univ[ucnt++] = new UnivFriend("김", "화공", "010");
//		
//		CompFriend[] ccomf= new CompFriend[5];
//		int ccnt = 0;
//		
//		ccomf[ucnt++] = new CompFriend("천", "컴공", "011");
//		ccomf[ucnt++] = new CompFriend("김", "화공", "011");
//		
//		for(UnivFriend uni : univ) {
//			if(uni != null) {
//			uni.showInfo();
//			}
//		}
//		for(CompFriend ccom : ccomf) {
//			if(ccom != null) {
//			ccom.showInfo();
//			}
//		}
	}
}
