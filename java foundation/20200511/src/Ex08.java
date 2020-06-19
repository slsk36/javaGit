/*
 * 배열 생성
 */
public class Ex08 {

	Ex08(){
		
		int temp1[] = new int[10];
		int[] temp2 = new int[10];
		
		System.out.println("temp1.lenght" +temp1.length);
		System.out.println("temp2.lenght" +temp2.length);
		
		temp1[0] = 10;
		for(int i=0; i<10;i++) {
			System.out.println("temp1 ["+i+"]= " +temp1[i]);
		}
		
		String a[] = new String[10];
		a[9] = "abc";
		for(int i=0; i<10;i++) {
			System.out.println("a ["+i+"]= " +temp1[i]);
		}
		a[10] = "aaa";
		System.out.println("에러발생되어 종료됨");
		
		
	}
	
	public static void main(String[] args) {
		new Ex08();
	}
}
