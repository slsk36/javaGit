/*
 * String Ŭ������ Ȱ��
 * ���� �ֹε�Ϲ�ȣ�� �߰��� ���Ե� -�� ����� �������� ä���� ����ϴ� ���α׷��� �ۼ��� ����
 * �� StringBuilderŬ������ Ȱ���Ͽ� ����� ���ڿ��� ������ �߻����� �ʵ��� �ؾ��Ѵ�.
 */
public class Ex11_2 {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("990925-1012999");
		
		str.replace(6, 7, " ");
		System.out.println(str.toString());
		
	}
}
