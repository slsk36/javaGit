/*
 * �������� ¦���ܸ� ����ϴ� ���α׷��� �ۼ��ϵ� 2���� 2x2, 4���� 4x4, 6x6 8x8���� ��� 
 */
public class Ex07 {
	public static void main(String[] args) {
		for(int i=2;i<10;i+=2) {
			for(int j=1;j<10;j++) {
				System.out.println(i+"x"+j+"="+(i*j)); //2,4,6,8�����
				
				if(j >= i)
					break;
			}
		}
	}
}
