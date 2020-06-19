class MyRapperInteger{
	private int _int = 0;

	public MyRapperInteger(int _int) {
		super();
		this._int = _int;
	}

	public int get_int() {
		return _int;
	}

	public void set_int(int _int) {
		this._int = _int;
	}

	@Override
	public String toString() {
		return "MyRapperInteger [_int=" + _int + "]";
	}
	
	
		
	
}

public class Ex01 {
//래퍼 클래스 Wrapper
	Ex01(){
		Integer iInst = new Integer(3);
		System.out.println(iInst.toString());  //tostring 호출
		System.out.println(iInst);			   //tostring 호출
		
		Integer iInst1 = new Integer("33");
		System.out.println(iInst1.toString());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		MyRapperInteger mri = new MyRapperInteger(99);
		System.out.println(mri);
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
