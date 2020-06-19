import java.util.Arrays;

//저장 배열의 비교 equals메소드
class A{
	
}

class INum{
	private int num;

	public INum(int num) {
		super();
		this.num = num;
	}

	@Override
	public boolean equals(Object obj) {
		if(this.num == ((INum)obj).num)
			return true;
		else
			return false;
	}
	
	
	
}
public class Ex09 {
	
	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new A();
		
		System.out.println(a1); //주소값(참조값)
		System.out.println(a2);
		System.out.println(a1.equals(a2)); //a1 == a2 와 같은 뜻
		
		INum[] ar1 = new INum[3];
		INum[] ar2 = new INum[3];
		
		ar1[0]=new INum(1); ar2[0]=new INum(1); //주소값을 서로 비교
		ar1[1]=new INum(2); ar2[1]=new INum(2);
		ar1[2]=new INum(3); ar2[2]=new INum(3);
		
		System.out.println(Arrays.equals(ar1, ar2));
	}
}