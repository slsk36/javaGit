class Box{
	String name;
	//alt + shift + s -> o ������ �ڵ��ϼ�
	public Box(String name) {
		this.name = name;
	}
	
	//alt+shift+s -> s toString�޼��� �ڵ��ϼ�
	public String toString() {
		return "Box [name=" + name + "]";
	}
}

public class Ex06 {
	public static void main(String[] args) {
		Box box1 = new Box("����ڽ�");
		System.out.println(box1);
		System.out.println(box1.toString());
		
		System.out.println();
		
		Box box2 = new Box("����ڽ�");
		System.out.println(box2);
		System.out.println(box2.toString());
	}

}
