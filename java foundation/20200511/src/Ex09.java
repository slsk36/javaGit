class Monitor{
	String name;
	//alt+shift+s=>o
	public Monitor(String name) {
		this.name = name;
	}
	//alt+shift+s=>s
	@Override
	public String toString() {
		return "Monitor [name=" + name + "]";
	}
	
}
public class Ex09 {
	public static void main(String[] args) {
		Monitor[] mo = new Monitor[3];
		mo[0] = new Monitor("�Ｚ�����");
		mo[1] = new Monitor("���������");
		mo[2] = new Monitor("�Ѽ������");
		
		for(int i=0; i<mo.length; i++) {
			System.out.println("mo["+i+ "]=" +mo[i]);
		}
	}
}
