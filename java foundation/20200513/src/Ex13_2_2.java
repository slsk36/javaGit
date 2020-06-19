/*
 * 2차원 배열
 * 1	2	3
 * 4	5	6
 * 7	8	9
 * 
 * 이러한 형태를 갖는 int형 2차원 배열이 인자로 전달되면, 다음의 형태로 배열의 구조를 변경
 * 
 * 7	8	9
 * 1	2	3
 * 4	5	6
 * 
 * 물론 배열의 가로와 세로 길이에 상관없이 위와같이 동작하도록 메소드를 정의
 */
public class Ex13_2_2 {
	
	public static void shift1(int[][] arr) {
		int[] lastLine = arr[arr.length-1];
		for (int i = arr.length-1; i > 0; i--)
			arr[i] = arr[i-1];
			
		arr[0] = lastLine;
		
	}
	
	public static void shift2(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) 
				System.out.print(arr[i][j]+"\t");
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		
		shift1(arr);
		shift2(arr);
		
//		System.out.println("2차");
//		shift1(arr);
//		shift2(arr);
//		
//		System.out.println("3차");
//		shift1(arr);
//		shift2(arr);
	}
}

