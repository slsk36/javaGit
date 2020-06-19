
public class CarMain {

		public CarMain() {
			GiaCar gc= new GiaCar();
			gc.name = "K5";
			gc.tellInfo();
			
			SsangyoungCar sc = new SsangyoungCar();
			sc.name="ÄÚ¶õµµ";
			sc.tellInfo();
			
			SamsungCar ss = new SamsungCar();
			ss.name = "SM5";
			ss.tellInfo();
		}
		public static void main(String[] args) {
			new CarMain();
		}
}
