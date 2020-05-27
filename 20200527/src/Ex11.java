import java.util.Arrays;

//Person ��ü comparable
class Person implements Comparable{
	int age;
	String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		return this.age - p.age;
//		if(this.age > p.age) {
//			return 1; //���ڽ��� ũ�� ū ���� ��ȯ
//		}
//		else if(this.age < p.age) {
//			return -1; //������ ������ ��ȯ
//		}
//		else {
//		return 0; //������ 0��ȯ
//		}
	} 								//���� �������� ����
}

public class Ex11 {
	Ex11(){
		Person[] ar = new Person[3];
		ar[0] = new Person(20, "ȫ�浿");
		ar[1] = new Person(10, "�̱浿");
		ar[2] = new Person(30, "��浿");
		
		Arrays.sort(ar);  //���̼� �������� ����
		
		for (int i=0; i<ar.length; i++) {
			System.out.println(ar[i].age);
			System.out.println(ar[i].name);
		}
	}
	public static void main(String[] args) {
		new Ex11();
	}
}
