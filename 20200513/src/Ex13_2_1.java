/*
 * ���� �޼ҵ�� int�� 1���� �迭�� ����� ���� �� ��° �Ű������� ���޵� ���� ũ�⸸ŭ ���� ������Ų��
 * public static void addOneDArr(int[] arr,int add){
 * for (int i = 0; i < arr.length; i++) {
 * arr[i] += add; }
 * �� �޼ҵ带 ȣ���ϴ� ���·�, int�� 2���� �迭�� ����� �� ���θ� �� ��° �Ű������� ���޵� ���� ũ�⸸ŭ ������Ű��
 * �޼ҵ带 ������ ���·� ��������.
 * private static void addTwoDArr(int[][] arr, int add) {}
 * �� �ȿ��� addOneDArr �޼ҵ带 ȣ���Ѵ�.
 */
public class Ex13_2_1 {

	public static void addOneDArr(int[] arr,int add){
		for (int i = 0; i < arr.length; i++) {
			arr[i] += add;
		}
	}
	
	private static void addTwoDArr(int[][] arr, int add) {
		// �� �ȿ��� addOneDArr �޼ҵ带 ȣ���Ѵ�.
		for (int i = 0; i < arr.length; i++) {
			addOneDArr(arr[i], add);
		}
	}
	
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{4,5,6,7},
				{8,9}
		};
		
		addTwoDArr(arr, 2); //�ι�° �Ű������� ���޵� ���� ũ�⸸ŭ ������Ű�� �޼ҵ�
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
