import java.util.Arrays;
/*
 * ����20-2. �̸��� ���� ������ ������ �ǵ��� �����غ���.
 * 		       �̸��� ���̰� ª�� �ν��Ͻ� �ϼ��� �迭�� ���ʿ� ��ġ�ϵ��� ����
 */

class Person2 implements Comparable{
	String name;
	int age;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		Person2 p = (Person2)o;
		return this.name.length() - p.name.length(); // ������������
//		return p.name.length() - this.name.length(); // ������������
	}

//	@Override
//	public int compareTo(Object o) {
//		Person2 p = (Person2)o;
//		if(this.name.length() > p.name.length())
//			return 1;
//		else if(this.name.length() < p.name.length())
//			return -1;
//		else
//			return 0;
//	}
	
}

public class Ex20_2_2 {
	Ex20_2_2(){
		
		Person2[] ar = new Person2[3];
		ar[0] = new Person2("leechanghoon", 50);
		ar[1] = new Person2("choigoon", 30);
		ar[2] = new Person2("sonsoojin", 40);
		
		Arrays.sort(ar);
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i].age+"�� ");
			System.out.print(ar[i].name);
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		new Ex20_2_2();
	}
}
