import java.util.Scanner;

/*
 * int�� 1���� �迭�� �Ű������� ���޹޾Ƽ� �迭�� ����� �ִ밪, �ּҰ��� ã�Ƽ� ��ȯ�ϴ� �޼ҵ带
 * ���� ������ ���·� ��������.
 * public static int minValue(int[] arr) //�ּҰ���ȯ
 * public static int maxValue(int[] arr) //�ִ밪��ȯ
 * �� �ݺ����� ����� �� minValue�� ���ǿ����� �Ϲ����� for���� ����ϰ� maxValue�� ���ǿ����� ���ο� for��(enhanced for��)
 * �� ����ϱ�� ����.
 */

public class Ex13_1 {
	
	public static int minValue(int[] arr) //�ּҰ���ȯ
	{
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) 
				min = arr[i];
		}
		return min;
	}
	public static int maxValue(int[] arr) //�ִ밪��ȯ
	{
		int max = arr[0];
		
		for (int i : arr) {
			if(max < i)
				max = i;
		}
		return max;
	}
	public static void main(String[] args) {
		
//		int arr[] = {5,4,87,1,99}; //1�����迭�� �Ű������� �����ϱ�
		Scanner scan = new Scanner(System.in);
		int arr[]=new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"��° ���� �Է�" +arr.length);
			int input = scan.nextInt();
			arr[i]=input;
		}
			
		System.out.println("�ּҰ�= "+minValue(arr));
		System.out.println("�ִ밪= "+maxValue(arr));
	}
}
