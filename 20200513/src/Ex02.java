/*
 * �л����� ���α׷� �����
 */

import java.util.Scanner;

public class Ex02 {
	private Student[] stus = new Student[10];
	int cnt=0;
	Ex02(){
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("1.�л��Է�\n 2.�л����\n 3.����");
			int select = scan.nextInt();
			if(select == 1) {
				System.out.println("�л��̸�: ");
				String name = scan.next(); 
				//nextLine();�� �����Ÿ� 12��° ���ο� scan.nextLint()�߰�
				System.out.println("�л�����: ");
				int age = scan.nextInt();
				stus[cnt]=new Student(name, age,(cnt+1));
				//�л��Է�
				System.out.println("1���� �л��� ����߽��ϴ�.");
				cnt++; //�л����� �����Է�
			}
			else if(select == 2) {
				//�л����
				for (int i = 0; i < stus.length; i++) {
					System.out.println("stus["+i+"]= "+stus[i]);
				}
			}
			else {
				break;//����
			}
			
		}
		
		
//		Student[] stus = new Student[10];
//		stus[0]=new Student("ȫ�浿",20,1);
//		stus[1]=new Student("��浿",30,1);
//		stus[2]=new Student("�赿��",40,1);
//		stus[3]=new Student("�̵���",10,1);
		
		//�迭�� ���� ����ϴ� ����
//		for (int i = 0; i < stus.length; i++) {
//			System.out.println("stus["+i+"]=" +stus[i]);
//		}
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}
