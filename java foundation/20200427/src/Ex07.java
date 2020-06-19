class Person{
	String name = "";
	
	void doStudy() {
		System.out.println(name+"¾¾°¡ °øºÎÇÏ°í ÀÖ¾î¿ä" );
				
	}
	
	void setName(String input) {
		name = input;
	}
}

public class Ex07 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("È«±æµ¿");
		p1.doStudy();
		
		Person p2 = p1;
		p2.setName("±è±æµ¿");
		p2.doStudy();
		
		p1.doStudy();
	}
}
