import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
//�ڹٷ� ��ư �����
import javax.swing.JFrame;
//JFrame �˾�â �߰��ϱ�


public class Ex01 extends JFrame{

	private JButton btn1 =new JButton("��ư");
	
	
	Ex01(){
		super("����"); //����Ŭ������ �ٸ� ������ ȣ��
		initcomponent(); 
	}
	
	public void initcomponent() {
		this.setLayout(null);
		
		this.setSize(300,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //â�� �����ϸ� ������ư�� �ȴ����� �ܼ��� ����ǰ� �ϱ�
		
		this.btn1.setBounds(50,50,100,50); //��ư�� ��ġ ����
		this.btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư�� ���Ƚ��ϴ�.");
				btn1.setBounds(100, 100, 100, 50);
				// ��ư�� ������ �ܼ�â�� �̺�Ʈ �߻�&��ư ��ġ ����
			}
		});
		this.add(btn1);
	}

	public static void main(String[] args) {
		new Ex01();
	}
}
