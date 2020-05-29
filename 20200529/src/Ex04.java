import java.util.ArrayList;

public class Ex04 {

	Ex04(){
		int[] a = new int[4];
		System.out.println("array");
		for (int temp : a) {
			System.out.println(temp);
		}
		System.out.println();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(0);
		al.add(1);
		al.add(2);
		System.out.println("collection");
		for (int temp : al) {
			System.out.println(temp);
		}
	}
	public static void main(String[] args) {
		new Ex04();
	}
}
