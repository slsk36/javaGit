/*
 * �޼ҵ� ����
 */
class AA{
	String a = "abcd";
	
	public String returnA() {
		return a;
	}
}

public class Ex05 {
	
	public static void main(String[] args) {
		//String a = new AA().returnA().concat("cc");
		//�����ؼ� ����
		AA aa = new AA();
		String a = aa.returnA();
		a=a.concat("cc");
		//�и��ؼ� ����
		System.out.println("a= " +a);
	}

}
