//�ܼ��� �θư��� ���α׷�  �迭�� ���

class Friend{
	protected String name;
	protected String phone;
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public void showInfo() {
		System.out.println("�̸�=" +this.name);
		System.out.println("��ȣ=" +this.phone);
	}
}


class UnivFriend extends Friend{
//	private String name;
	private String major;
//	private String phone;
//	alt+shift+o ������
	public UnivFriend(String name, String major, String phone) {
		super(name,phone);
//		this.name=na;
		this.major=major;
//		this.phone=ph;
	}
	public void showInfo() {
		super.showInfo(); //�ڽĿ��� ������ �ش�Ǵ� Ŭ���� ��µ�
//		System.out.println("�̸�=" +this.name);
		System.out.println("����=" +this.major);
//		System.out.println("��ȣ=" +this.phone);
	}
}

class CompFriend extends Friend{
//	private String name;
	private String department;
//	private String phone;
	//alt+shifts =>o ������
	public CompFriend(String name, String department, String phone) {
		super(name,phone);
//		this.name=na;
		this.department=department;
//		this.phone=ph;
	}
	public void showInfo() {
		super.showInfo();
//		System.out.println("�̸�=" +this.name);
		System.out.println("����=" +this.department);
//		System.out.println("��ȣ=" +this.phone);
	}
}

public class MyFreinds {
	public static void main(String[] args) {
		
		Friend[] fri = new Friend[10]; //Friend ��ü�� 10�� ����
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
//		univ[ucnt++] = new UnivFriend("ȫ", "�İ�", "010");
//		univ[ucnt++] = new UnivFriend("��", "ȭ��", "010");
//		
//		CompFriend[] ccomf= new CompFriend[5];
//		int ccnt = 0;
//		
//		ccomf[ucnt++] = new CompFriend("õ", "�İ�", "011");
//		ccomf[ucnt++] = new CompFriend("��", "ȭ��", "011");
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
