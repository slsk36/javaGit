class Person{
	String name = "";
	
	void doStudy() {
		System.out.println(name+"���� �����ϰ� �־��" );
				
	}
	
	void setName(String input) {
		name = input;
	}
}

public class Ex07 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("ȫ�浿");
		p1.doStudy();
		
		Person p2 = p1;
		p2.setName("��浿");
		p2.doStudy();
		
		p1.doStudy();
	}
}
