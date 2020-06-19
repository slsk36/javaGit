import java.util.Arrays;
/*
 * 문제20-1. 나이의 역순으로 정렬이 되도록 해보자.
 * 			다시 말해서 많은 나이의 인스턴스일수록 배열의 앞쪽에 위치하도록 수정해보자
 */

class Persons implements Comparable{
	String name;
	int age;
	
	public Persons(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		Persons p = (Persons)o;
		if(this.age < p.age)
			return 1;
		else if(this.age > p.age)
			return -1;
		else
			return 0;
	}
}

public class Ex20_2_1 {
	Ex20_2_1(){
		
		Persons[] ar = new Persons[3];
		ar[0] = new Persons("lee", 50);
		ar[1] = new Persons("choi", 30);
		ar[2] = new Persons("son", 40);
		
		Arrays.sort(ar);
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i].age+"세 ");
			System.out.print(ar[i].name);
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		new Ex20_2_1();
	}
}