import java.util.Scanner;

class MyException extends Exception{
	public MyException() {
		super("����ä����");
	}
}

public class Ex04 {
	
	public static void main(String[] args) throws MyException {
		
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ������");
		String menu = scan.nextLine();
		if(menu.contains("���")) {
			System.out.println("����");
		}
		else {
			throw new MyException();
		}
		}
		catch(MyException e){
			System.out.println("��⸸ ����");
		}
		
	}
}
