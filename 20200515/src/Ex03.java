class Mobile{
	protected String number;
	
	public Mobile(String num) {
		number = num;
	}
	public void answer() {
		System.out.println("Hi~ from " + number);
	}
}

class Smart extends Mobile{
	private String androidVer;
	
	public Smart(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	public void playApp() {
		System.out.println("App is running in "+androidVer);
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Smart ph1= new Smart("010-555-777", "Noug");
		Mobile ph2= new Smart("010-333-999", "Noug");
		
		ph1.answer();
		ph1.playApp();
		System.out.println();
		
		ph2.answer();
		
	}
}
