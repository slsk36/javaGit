/*
 *String�� ���ڿ� �޸� �ּ� ���� Ȯ��
 */
public class Ex04 {

		public static void main(String[] args) {
			
			String a ="abcd";
			String b ="abcd";
			
			String c = new String("abcd");
			String d = new String("abcd");
			
			if(a==b){
				System.out.println("a=b���� �޸��ּ� ����");
			}else {
				System.out.println("a��b�ٸ� �޸��ּ� ����");
			}
			if(c==d) {
				System.out.println("a=b���� �޸��ּ� ����");
			}else {
				System.out.println("a��b�ٸ� �޸��ּ� ����");
			}
			
			if(c.equals(d)) {
				System.out.println("����");
			}else {
				System.out.println("�ٸ���");
			}
			
			double doublea = 10.23;
			//String stringa = doublea+"";
			String stringa = String.valueOf(doublea);
			
		}
}
