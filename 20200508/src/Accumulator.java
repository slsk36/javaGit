import java.util.Scanner;

/*
 * ���� main�޼ҵ�� �Բ� �����ϴ� Accumulator class�� ��������. �׸��� Accumulator class��
 * main method�� �־ ������ �� ������ ����
 * ���� �����, �� showResult �޼ҵ��� ȣ�� ����� ������ ���� ������ ����� ���̸� �ȴ�.
 * sum = 45
 */


public class Accumulator {
	static int sum = 0;

    static void add(int n) {
        sum += n;
    }
    static void showResult() {
        System.out.println("������ sum = " +sum);
    }

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("���� ����� �� n= ");
    	int n = scan.nextInt();
        for(int i = 0; i <= n; i++)
        
            Accumulator.add(i);     // ���޵Ǵ� ���� ��� ����
        
        Accumulator.showResult();    // ���� ���� ����� ���
    }
}

