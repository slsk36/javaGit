//Generic �� �⺻���� 21-2
//���� �Ű����� ��� ���׸� Ŭ������ ����

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
		NCBox<String, Integer> ncb1 = new NCBox<String, Integer>("���",30);
		System.out.println(ncb1);
	}
	
	public static void main(String[] args) {
		new Ex05();
	}
}
