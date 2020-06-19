package aa;

import animal.Dog;
import zoo.Cat;

public class ZooMain {

		public static void main(String[] args) {
		
				Cat c = new Cat();
				Dog d = new Dog();
				
				c.makeSound();
//				c.happy(); // 접근수준이 default라서 안됨
				
				d.welcome(c);
		}
}
