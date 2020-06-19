import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
//자바로 버튼 만들기
import javax.swing.JFrame;
//JFrame 팝업창 뜨게하기


public class Ex01 extends JFrame{

	private JButton btn1 =new JButton("버튼");
	
	
	Ex01(){
		super("계산기"); //상위클래스의 다른 생성자 호출
		initcomponent(); 
	}
	
	public void initcomponent() {
		this.setLayout(null);
		
		this.setSize(300,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창을 종료하면 정지버튼을 안눌러도 콘솔이 종료되게 하기
		
		this.btn1.setBounds(50,50,100,50); //버튼의 위치 지정
		this.btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 눌렸습니다.");
				btn1.setBounds(100, 100, 100, 50);
				// 버튼을 누르면 콘솔창에 이벤트 발생&버튼 위치 변경
			}
		});
		this.add(btn1);
	}

	public static void main(String[] args) {
		new Ex01();
	}
}
