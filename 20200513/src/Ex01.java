
public class Ex01 {

	Ex01(){
		int array[]= {1,34,20,2,10,34,290,30};
		
		int min = array[0];
		int max = array[0];
		for(int i:array) {
			if(i>min) {
				min=i;
			}
			if(i<max) {
				max=i;
			}
		}
		System.out.println("최대값 " +max);
		System.out.println("최소값 " +min);
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
