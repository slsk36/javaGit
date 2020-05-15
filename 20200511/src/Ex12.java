class House{
	private String name;
	//shift+alt+s->r
	public House(String name) {
		this.name = name;
	}
	//shift+alt+s->s
	@Override
	public String toString() {
		return "House [name=" + name + "]";
	}
	
}
public class Ex12 {
	Ex12(){
		House house[] = new House[3];
		house[0] = new House("»ï");
		house[1] = new House("¼º");
		house[2] = new House("¸Ç");
		for( House temp:house) {
			System.out.println("tmep=" +temp);
		}
	}
	public static void main(String[] args) {
		new Ex12();
	}
}
