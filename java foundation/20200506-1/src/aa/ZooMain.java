package aa;

import animal.Dog;
import zoo.Cat;

public class ZooMain {

		public static void main(String[] args) {
		
				Cat c = new Cat();
				Dog d = new Dog();
				
				c.makeSound();
//				c.happy(); // ���ټ����� default�� �ȵ�
				
				d.welcome(c);
		}
}
