class PreAdder{
	public int add(int a, int b) {
		return a+b;
	}
}

class ChidAdder extends PreAdder{
	
	public int add(int a,int b) {
		System.out.println("µ¡¼ÀÀ» ÁøÇàÇÕ´Ï´Ù");
		return a+b;
	}
}


public class OverrideMistake {

	public static void main(String[] args) {
		PreAdder pa = new ChidAdder();
		
		int result = pa.add(10,5);
		
		System.out.println("result= " +result);
	}
}
