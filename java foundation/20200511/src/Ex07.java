/*
 * Scanner로 a.txt파일에 있는 내용 출력하기
 */

import java.io.File;
import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		try {
			File file = new File("src/a.txt");
			Scanner sc = new Scanner(file);
			int a = sc.nextInt();
			System.out.println("a= "+a);
			
			int b = sc.nextInt();
			System.out.println("b= "+b);
			
			int c = sc.nextInt();
			System.out.println("c= "+c);
			
			int d = sc.nextInt();
			System.out.println("d= "+d);
			
			String e = sc.next();
			System.out.println("e= "+e);
			
			String f = sc.next();
			System.out.println("f= "+f);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
