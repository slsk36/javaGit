import java.util.Arrays;

//Person 객체 comparable
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
//			return 1; //내자신이 크면 큰 수를 반환
//		}
//		else if(this.age < p.age) {
//			return -1; //작으면 음수를 반환
//		}
//		else {
//		return 0; //같으면 0반환
//		}
	} 								//나이 오름차순 정렬
}

public class Ex11 {
	Ex11(){
		Person[] ar = new Person[3];
		ar[0] = new Person(20, "홍길동");
		ar[1] = new Person(10, "이길동");
		ar[2] = new Person(30, "김길동");
		
		Arrays.sort(ar);  //나이순 오름차순 정렬
		
		for (int i=0; i<ar.length; i++) {
			System.out.println(ar[i].age);
			System.out.println(ar[i].name);
		}
	}
	public static void main(String[] args) {
		new Ex11();
	}
}
