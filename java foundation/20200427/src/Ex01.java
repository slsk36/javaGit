//문제풀이
//구구단 출력
public class Ex01 {
	public static void main(String[] args) {
		for (int i=2; i<9; i+=2) {
			System.out.println("i="+i);
			for(int j=1; j<i+1; j++) {
				System.out.println("i*j=" +(i*j));
			}
			
		}
	}
}
