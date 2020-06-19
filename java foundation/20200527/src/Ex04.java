import java.util.Random;
//난수생성
public class Ex04 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println(rand.nextInt());
		}
	}
}
