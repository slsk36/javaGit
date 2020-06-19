interface Printable{
	void doPrint(String doc);
}
class Print implements Printable{
	@Override
	public void doPrint(String doc) {
		System.out.println(doc);
	}
}

public class Ex02 {

	Ex02(){
		Print print = new Print();
		print.doPrint("안녕 인터페이스");
		
		Printable pb = new Printable() {
			
			@Override
			public void doPrint(String doc) {
			}
		};
//		Printable pb2 = new Printable
	}
	public static void main(String[] args) {
		new Ex02();
	}
}
