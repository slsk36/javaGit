/*
 * 다음 식을 만족하는 모든 A와 B의 조합
 *   A B
 * + B A
 * -------
 *   9 9
 */
public class Ex08 {
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				if((i*10+j)+(j*10+i)==99)
					System.out.println(i+" "+j);
			}
		}
	}
}
