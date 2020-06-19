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
		System.out.println("자동차 이름은 ="+name);
		System.out.println("브랜드 이름은 ="+brand);
		System.out.println("자동차 색깔 ="+color);
		System.out.println("자동차 가격 ="+price);
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
		Car car1 = new Car("소나타", "현대", "하얀색", 100);
		Car car2 = new Car("그랜저", "현대", "검정색", 200);
		Car car3 = new Car("아반떼", "현대", "회색", 300);
		
//		car1.doInit("소나타", "현대", "하얀색", 100);
//		car2.doInit("그랜저", "현대", "검정색", 200);
//		car3.doInit("아반떼", "현대", "회색", 300);
		
		car1.doPrint();
		car2.doPrint();
		car3.doPrint();
	}
}











