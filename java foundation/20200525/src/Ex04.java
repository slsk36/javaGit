import java.util.Scanner;

class MyException extends Exception{
	public MyException() {
		super("고기야채생선");
	}
}

public class Ex04 {
	
	public static void main(String[] args) throws MyException {
		
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("점심 뭐먹지");
		String menu = scan.nextLine();
		if(menu.contains("고기")) {
			System.out.println("정상");
		}
		else {
			throw new MyException();
		}
		}
		catch(MyException e){
			System.out.println("고기만 가능");
		}
		
	}
}