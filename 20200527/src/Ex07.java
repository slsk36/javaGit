import java.util.Arrays;
//배열의 복사 copyOf a의 배열을 3개만 복사하라
//a의 배열의 모두 복사하라.
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
