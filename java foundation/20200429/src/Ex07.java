import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Car{
	String name;
	String brand;
	String color;
	int price;
	
	public Car(String n,String b,String c, int p) {
		name = n;
		brand = b;
		color = c;
		price = p;
	}
	
	public void doPrint() {
		System.out.println("�ڵ��� �̸��� ="+name);
		System.out.println("�귣�� �̸��� ="+brand);
		System.out.println("�ڵ��� ���� ="+color);
		System.out.println("�ڵ��� ���� ="+price);
	}
	public void doInit(String n,String b,String c, int p) {
		name = n;
		brand = b;
		color = c;
		price = p;
	}
}

public class Ex07 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("d:\\a.txt"));
		Car car1 = new Car("�ҳ�Ÿ", "����", "�Ͼ��", 100);
		Car car2 = new Car("�׷���", "����", "������", 200);
		Car car3 = new Car("�ƹݶ�", "����", "ȸ��", 300);
		
//		car1.doInit("�ҳ�Ÿ", "����", "�Ͼ��", 100);
//		car2.doInit("�׷���", "����", "������", 200);
//		car3.doInit("�ƹݶ�", "����", "ȸ��", 300);
		
		car1.doPrint();
		car2.doPrint();
		car3.doPrint();
	}
}











