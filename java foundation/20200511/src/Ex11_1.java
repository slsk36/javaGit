/*
 * String Ŭ������ Ȱ��
 * ���� �ֹε�Ϲ�ȣ�� �߰��� ���Ե� -�� ����� �������� ä���� ����ϴ� ���α׷��� �ۼ��� ����
 */
public class Ex11_1 {

	public static void main(String[] args) {
		String str = "990925-1012999";
		String str2 = str.substring(0,6);
//		System.out.println(str2);
		
		String str3 = str.substring(7);
//		System.out.println(str3);
		
		String str4 = str2.concat(" ").concat(str3);
		
		
		System.out.println(str4);
		System.out.println(str2+" "+str3);
	}
}
