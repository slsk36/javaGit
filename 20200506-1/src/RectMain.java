
public class RectMain {

		public static void main(String[] args) {
			Rect r1 = new Rect();
			
//		r1.width = 100; private으로 지정되어 있어서 이렇게하면 연결안됨
		r1.setWidth(100);
		
		System.out.println(r1.getWidth());
		}
}
