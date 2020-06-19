//Generic 의 기본문법 21-2
//다중 매개변수 기반 제네릭 클래스의 정의

class NCBox<L,R>{
	L name;
	R count;
	
	public NCBox(L name, R count) {
		super();
		this.name = name;
		this.count = count;
	}

	@Override
	public String toString() {
		return "NCBox [name=" + name + ", count=" + count + "]";
	}
	
}
public class Ex05 {
	Ex05(){
		NCBox<String, Integer> ncb1 = new NCBox<String, Integer>("사과",30);
		System.out.println(ncb1);
	}
	
	public static void main(String[] args) {
		new Ex05();
	}
}
