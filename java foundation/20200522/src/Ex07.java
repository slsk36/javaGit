import javax.swing.JOptionPane;

class A{
	private int a = 10;
}

class B extends A{
	private int b = 20;
}

public class Ex07 {
	
	Ex07(){
		
		try {
		int[] arr= {1,2,3};
		
		for (int i = 0; i < 4; i++) {
			System.out.println("arr["+i+"] = " +arr[i]); //IndexOutofBoundsException
			}
		
		
		
		A a = new A();
		B b = (B) a; //classcastException
		
		
		String c = null;
		System.out.println(c.length()); //nullpointerExcption
		
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�迭�����ʰ�");
		}
		catch(ClassCastException e) {
			System.out.println("Ŭ��������ȯ ����");
		}
		catch(NullPointerException e) {
			System.out.println("null�� ����");
		}
		catch(Exception e) { //��� ���ܻ�Ȳ ó��
			e.printStackTrace();
		}
		
		
		System.out.println("��������");
		
		
		String test = JOptionPane.showInputDialog("�Է��ϼ���"); 
		System.out.println("test= " +test);
		//�迭�� ��������ǰ� ���� �Է�â ���̾�α� �˾� �� �ֿܼ� ������µ�
		
		int bb=0;
		try {
		if( (bb = Integer.parseInt(test)) ==1) {
			System.out.println("1�� �Է��߽��ϴ�.");
		}
		}
		catch(Exception e) {
			System.out.println("�����Է������Ƿ� bb = 0");
		}
		
	}

	public static void main(String[] args) {
		new Ex07();
	}
}
