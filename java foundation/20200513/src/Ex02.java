/*
 * 학생관리 프로그램 만들기
 */

import java.util.Scanner;

public class Ex02 {
	private Student[] stus = new Student[10];
	int cnt=0;
	Ex02(){
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("1.학생입력\n 2.학생출력\n 3.종료");
			int select = scan.nextInt();
			if(select == 1) {
				System.out.println("학생이름: ");
				String name = scan.next(); 
				//nextLine();을 넣을거면 12번째 라인에 scan.nextLint()추가
				System.out.println("학생나이: ");
				int age = scan.nextInt();
				stus[cnt]=new Student(name, age,(cnt+1));
				//학생입력
				System.out.println("1명의 학생을 등록했습니다.");
				cnt++; //학생정보 누적입력
			}
			else if(select == 2) {
				//학생출력
				for (int i = 0; i < stus.length; i++) {
					System.out.println("stus["+i+"]= "+stus[i]);
				}
			}
			else {
				break;//종료
			}
			
		}
		
		
//		Student[] stus = new Student[10];
//		stus[0]=new Student("홍길동",20,1);
//		stus[1]=new Student("김길동",30,1);
//		stus[2]=new Student("김동길",40,1);
//		stus[3]=new Student("이동길",10,1);
		
		//배열의 내용 출력하는 구문
//		for (int i = 0; i < stus.length; i++) {
//			System.out.println("stus["+i+"]=" +stus[i]);
//		}
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}
