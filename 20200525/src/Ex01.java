import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = null; //������ scan.close�� �����߻�
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
					System.out.println("���� ����ȯ ����");
					sum += intvalue;
				}
				catch (Exception e) {
					System.out.println("temp= "+temp);
					System.out.println("���� ����ȯ ����");
				}
			}
			
		}
		catch(FileNotFoundException e){ //FileNotFound���ܸ� ó��
			e.printStackTrace();
		}
		catch(Exception e) { //��� ���ܸ� ó��
			e.printStackTrace(); //���� ����
		}
		
		System.out.println("sum= " +sum);
		
		System.out.println("��������");
		scan.close();
	}
}
