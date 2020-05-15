/*
 * 2���� �迭
 * 1	2	3
 * 4	5	6
 * 7	8	9
 * 
 * �̷��� ���¸� ���� int�� 2���� �迭�� ���ڷ� ���޵Ǹ�, ������ ���·� �迭�� ������ ����
 * 
 * 7	8	9
 * 1	2	3
 * 4	5	6
 * 
 * ���� �迭�� ���ο� ���� ���̿� ������� ���Ͱ��� �����ϵ��� �޼ҵ带 ����
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
		
//		System.out.println("2��");
//		shift1(arr);
//		shift2(arr);
//		
//		System.out.println("3��");
//		shift1(arr);
//		shift2(arr);
	}
}

