/*
 * 다음 클래스 각각에 적절한 생성자를 삽입해보자.
 * 상속관계를 고려하여 각 클래스별로 필요한 생성자를 삽입해야 한다.
 * Car는 가솔린으로 동작하는 자동차
 * HybridCar는 가솔린과 전기로 동작
 * HybridWaterCar는 가솔린과 전기와 물도 연료로 사용할 수 있는 꿈의 자동차
 */
class Carr{ //기본자동차
	int gasolineGauge; //가솔린 잔여량
	
	public Carr(int a) {
		gasolineGauge = a;
	}
}

class HybridCar extends Carr{ //하이브리드 자동차
	int electricGauge; //전기 배터리 잔여량
	
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
		System.out.println("잔여 가솔린: "+gasolineGauge);
		System.out.println("잔여 전기: "+electricGauge);
		System.out.println("잔여 워터: "+waterGauge);
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
