/*
 * ���� Ŭ���� ������ ������ �����ڸ� �����غ���.
 * ��Ӱ��踦 ����Ͽ� �� Ŭ�������� �ʿ��� �����ڸ� �����ؾ� �Ѵ�.
 * Car�� ���ָ����� �����ϴ� �ڵ���
 * HybridCar�� ���ָ��� ����� ����
 * HybridWaterCar�� ���ָ��� ����� ���� ����� ����� �� �ִ� ���� �ڵ���
 */
class Carr{ //�⺻�ڵ���
	int gasolineGauge; //���ָ� �ܿ���
	
	public Carr(int a) {
		gasolineGauge = a;
	}
}

class HybridCar extends Carr{ //���̺긮�� �ڵ���
	int electricGauge; //���� ���͸� �ܿ���
	
	public HybridCar(int a, int b) {
		super(b);
		electricGauge = b;
	}
}

class HybridWaterCar extends HybridCar{
	int waterGauge;
	
	public HybridWaterCar(int a, int b, int c) {
		super(a,b);
		waterGauge = c;
	}
	
	void showCurrentGauge() {
		System.out.println("�ܿ� ���ָ�: "+gasolineGauge);
		System.out.println("�ܿ� ����: "+electricGauge);
		System.out.println("�ܿ� ����: "+waterGauge);
	}
}

public class Ex14_1 {
	public static void main(String[] args) {
		HybridWaterCar Carr1 = new HybridWaterCar(4, 2, 3);
		Carr1.showCurrentGauge();
		
		HybridWaterCar Carr2 = new HybridWaterCar(9, 5, 7);
		Carr2.showCurrentGauge();
	}
	
}
