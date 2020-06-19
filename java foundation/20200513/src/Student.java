
public class Student {

		private String name;
		private int age;
		private int STU_NUMBER;
		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + ", STU_NUMBER=" + STU_NUMBER + "]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getSTU_NUMBER() {
			return STU_NUMBER;
		}
		public void setSTU_NUMBER(int sTU_NUMBER) {
			STU_NUMBER = sTU_NUMBER;
		}
		public Student(String name, int age, int sTU_NUMBER) {
			super();
			this.name = name;
			this.age = age;
			STU_NUMBER = sTU_NUMBER;
		}
		
		
		
		
		
}
