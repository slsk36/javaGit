class PrimeNumber {
	// a = 5 1,5로 나누었을때만 0으로 떨어지기 때문에 소수 2개
	// a = 10 1,2,5,10 으로 나누었을 0으로 떨어지기때문에 소수가 아니다 4개
	public boolean doPrime(int a) {
		int cnt = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0)
				cnt++;
		}
		if (cnt == 2) {
			return true;
		} else {
			return false;
		}
	}
}

public class Ex04 {
	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
		for (int i = 2; i < 101; i++) {
			boolean temp = pn.doPrime(i);
			if (temp) {
				System.out.println(i);
			}
		}
	}
}