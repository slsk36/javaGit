class PrimeNumber {
	// a = 5 1,5�� ������������ 0���� �������� ������ �Ҽ� 2��
	// a = 10 1,2,5,10 ���� �������� 0���� �������⶧���� �Ҽ��� �ƴϴ� 4��
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