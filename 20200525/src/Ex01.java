import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = null; //없으면 scan.close에 에러발생
		int sum=0;
		try {
			scan = new Scanner(new File("d:\\a.txt"));
//			String a = scan.next();
//			System.out.println("a= "+a);
//			
//			String b = scan.next();
//			System.out.println("b= "+b);
			
			String temp = null;
			while((temp=scan.next()) != null) {
//				System.out.println(temp);
				
				try {
					int intvalue = Integer.parseInt(temp);
					System.out.println("temp= "+temp);
					System.out.println("숫자 형변환 성공");
					sum += intvalue;
				}
				catch (Exception e) {
					System.out.println("temp= "+temp);
					System.out.println("문자 형변환 실패");
				}
			}
			
		}
		catch(FileNotFoundException e){ //FileNotFound예외를 처리
			e.printStackTrace();
		}
		catch(Exception e) { //모든 예외를 처리
			e.printStackTrace(); //에러 추적
		}
		
		System.out.println("sum= " +sum);
		
		System.out.println("정상종료");
		scan.close();
	}
}
