/*
 *  문제13-2-2 선생님 문제 풀이
 */
class ArrayCalu{
	public static void addOneArr(int[] arr, int add) {
//		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			arr[i] +=  add; 
		}
	}
	public static void addTwoArr(int[][] arr, int add) {
//		System.out.println("addTwoArr");
//		addOneArr(arr[0], add);
//		addOneArr(arr[1], add);
//		addOneArr(arr[2], add);
		
		for (int i = 0; i < arr.length; i++) {
			ArrayCalu.addOneArr(arr[i], add);
		}
	}
	public static void doPrint(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]+"\t");
			}
		}
	}
}

public class Ex01 {
	public static void main(String[] args) {
		
//		ArrayCalu.addOneArr(null, 0);
		
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		ArrayCalu.addTwoArr(arr, 3);
		ArrayCalu.doPrint(arr);
	}
}
