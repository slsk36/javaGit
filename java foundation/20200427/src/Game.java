import java.util.Scanner;

class Human{
	int hp=100;
	//����� ���͸� �����ؾ� �Ѵ�.
	void doAtt( Monster mon) {
		mon.hp = mon.hp -3;
		System.out.println("���� hp ="+mon.hp);
	}
}
class Monster{
	int hp=100;
	//���Ͱ� ����� �����ؾ� �Ѵ�.
	void doAtt( Human human) {
		human.hp = human.hp-4;
		System.out.println("��� hp="+human.hp);
		
	}
}
public class Game {
	public static void main(String[] args) {
		Human h1 = new Human();
		Monster m1 = new Monster();
		
		Scanner scan = new Scanner(System.in);		
		
		while(true) {
			System.out.println("���� �ൿ�� �Ͻðڽ��ϱ�\n1�� ����� ���� ����");
				
			System.out.println("2�� ���Ͱ� ��� ����\n3�� ����");
				
			int select = scan.nextInt();
			if (select==1) {
				h1.doAtt(m1);
			}else if(select==2) {
				m1.doAtt(h1);
			}else {
				System.out.println("����˴ϴ�.");
				System.exit(1);
				}
			}
		}
    }

