import javax.swing.JOptionPane;

class A{
	private int a = 10;
}

class B extends A{
	private int b = 20;
}

public class Ex07 {
	
	Ex07(){
		
		try {
		int[] arr= {1,2,3};
		
		for (int i = 0; i < 4; i++) {
			System.out.println("arr["+i+"] = " +arr[i]); //IndexOutofBoundsException
			}
		
		
		
		A a = new A();
		B b = (B) a; //classcastException
		
		
		String c = null;
		System.out.println(c.length()); //nullpointerExcption
		
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열범위초과");
		}
		catch(ClassCastException e) {
			System.out.println("클래스형변환 실패");
		}
		catch(NullPointerException e) {
			System.out.println("null값 실패");
		}
		catch(Exception e) { //모든 예외상황 처리
			e.printStackTrace();
		}
		
		
		System.out.println("정상종료");
		
		
		String test = JOptionPane.showInputDialog("입력하세요"); 
		System.out.println("test= " +test);
		//배열이 정상종료되고 나면 입력창 다이얼로그 팝업 후 콘솔에 내용출력됨
		
		int bb=0;
		try {
		if( (bb = Integer.parseInt(test)) ==1) {
			System.out.println("1을 입력했습니다.");
		}
		}
		catch(Exception e) {
			System.out.println("문자입력했으므로 bb = 0");
		}
		
	}

	public static void main(String[] args) {
		new Ex07();
	}
}
