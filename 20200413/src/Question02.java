//문제2 예제 SCE.java를 어떻게 수정해야 num2의 값이 증가?
public class Question02 {
	public static void main(String[] args) {
		int num1 = 0; 
        int num2 = 0;
        boolean result;

        num1 += 10; //add
        num2 += 10; //add       
        result = (num1 < 0) && (num2 > 0); //modify

        System.out.println("result = " + result);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2 + '\n');
		
        num1 += 10;
        num2 += 10;        
        result = (num1 > 0) || (num2 > 0);

        System.out.println("result = " + result);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
	}
}
