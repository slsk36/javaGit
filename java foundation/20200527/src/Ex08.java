import java.util.Arrays;

//ArrayCopy

public class Ex08 {
	Ex08(){
		int a[] = {1,2,3,4,5};
		int b[] = {0,0,0,0,0,0,0,0,0};
		
		System.arraycopy(a, 1, b, 2, 3);
		
		for(int i :b) {
			System.out.println(i+" ");
		}
	}
	public static void main(String[] args) {
		new Ex08();
	}
}
