class GiaCar extends Car {
	GiaCar(){
		super();
	}//�⺻������ �����Ǿ��� ǥ��
	
	public void tellInfo() {
//		System.out.println("name= "+name);
		System.out.println("�����");
		tellName();
	}
}

class SsangyoungCar extends Car{
	public void tellInfo() {
		System.out.println("�ֿ�");
		tellName();
	}
}

class SamsungCar extends Car{
	public void tellInfo() {
		System.out.println("�Ｚ��");
		tellName();
	}
	
}
public class Car {
	String name;
	Car(){}
	Car(String name){
		this.name = name;
	}
//	String name;
	public void tellName() {
		System.out.println("name= "+name);
	}
}
