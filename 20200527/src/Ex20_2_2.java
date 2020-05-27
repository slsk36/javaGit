import java.util.Arrays;
/*
 * 문제20-2. 이름의 길이 순으로 정렬이 되도록 수정해보자.
 * 		       이름의 길이가 짧은 인스턴스 일수록 배열의 앞쪽에 위치하도록 수정
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
		return this.name.length() - p.name.length(); // 오름차순정렬
//		return p.name.length() - this.name.length(); // 내림차순정렬
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
			System.out.print(ar[i].age+"세 ");
			System.out.print(ar[i].name);
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		new Ex20_2_2();
	}
}
