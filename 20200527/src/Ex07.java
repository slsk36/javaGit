import java.util.Arrays;
//�迭�� ���� copyOf a�� �迭�� 3���� �����϶�
//a�� �迭�� ��� �����϶�.
public class Ex07 {
	Ex07(){
		int a[] = {1,2,3,4,5};
		
//		int b[] = Arrays.copyOf(a, 3);
		int b[] = Arrays.copyOf(a, a.length);
		
		int c[] = new int[a.length];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = a[i];
		}
		
		for (int i : b) {
			System.out.println(i+" ");
		}
		
		a[0] = 5;
		for (int i : b) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		new Ex07();
	}
}
