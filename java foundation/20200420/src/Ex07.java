/*
 * 구구단의 짝수단만 출력하는 프로그램을 작성하되 2단은 2x2, 4단은 4x4, 6x6 8x8까지 출력 
 */
public class Ex07 {
	public static void main(String[] args) {
		for(int i=2;i<10;i+=2) {
			for(int j=1;j<10;j++) {
				System.out.println(i+"x"+j+"="+(i*j)); //2,4,6,8단출력
				
				if(j >= i)
					break;
			}
		}
	}
}
