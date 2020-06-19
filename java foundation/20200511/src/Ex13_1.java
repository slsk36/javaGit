import java.util.Scanner;

/*
 * int형 1차원 배열을 매개변수로 전달받아서 배열에 저장된 최대값, 최소값을 찾아서 반환하는 메소드를
 * 각각 다음의 형태로 정의하자.
 * public static int minValue(int[] arr) //최소값반환
 * public static int maxValue(int[] arr) //최대값반환
 * 단 반복문을 사용할 때 minValue의 정의에서는 일반적인 for문을 사용하고 maxValue의 정의에서는 새로운 for문(enhanced for문)
 * 을 사용하기로 하자.
 */

public class Ex13_1 {
	
	public static int minValue(int[] arr) //최소값반환
	{
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) 
				min = arr[i];
		}
		return min;
	}
	public static int maxValue(int[] arr) //최대값반환
	{
		int max = arr[0];
		
		for (int i : arr) {
			if(max < i)
				max = i;
		}
		return max;
	}
	public static void main(String[] args) {
		
//		int arr[] = {5,4,87,1,99}; //1차원배열을 매개변수로 전달하기
		Scanner scan = new Scanner(System.in);
		int arr[]=new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"번째 정수 입력" +arr.length);
			int input = scan.nextInt();
			arr[i]=input;
		}
			
		System.out.println("최소값= "+minValue(arr));
		System.out.println("최대값= "+maxValue(arr));
	}
}
