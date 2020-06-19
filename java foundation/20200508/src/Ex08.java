// 초기값이 있어도 값을 바꾸고 싶을때 사용
public class Ex08 {
	int a = 10;
	int b = 20;
	Ex08(){
		
	}
	
	Ex08(int aa){
		a= aa;
	}
	Ex08(int aa,int bb){
		a=aa;
		b=bb;
	}
	public void doPrint() {
		System.out.println("a = "+a);
		System.out.println("b = "+b+"\n");
	}
	
	public static void main(String[] args) {
		Ex08 ex1 = new Ex08();
		Ex08 ex2 = new Ex08(11);
		Ex08 ex3 = new Ex08(12,22);
		ex1.doPrint();
		ex2.doPrint();
		ex3.doPrint();
	}
}
