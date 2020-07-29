package orgdi.nn.org;

public class A {

	private String name;

	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public A() {}
	public A(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}
}
