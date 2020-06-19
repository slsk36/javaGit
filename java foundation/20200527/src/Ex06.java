//Array클래스 배열의 복사

public class Ex06 {
	Ex06(){
		int[] a= {1,2,3,4,5};
		int[] b =a;
		
		for (int i : a) {
			System.out.print(i+",");
		}
		
		for (int i : b) {
			System.out.print(i+",");
		}
		
		System.out.println();
		a[0]=10;
		
		for (int i : a) {
			System.out.print(i+",");
		}
		for (int i : b) {
			System.out.print(i+",");
		}
	}
	
	public static void main(String[] args) {
		new Ex06();
	}
}
