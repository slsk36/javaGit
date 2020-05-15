import java.util.Scanner;

/*
 * �غ��� ���� ������ ������ �� �ִ� Triangle Ŭ������ ��������(�� �ȿ� ������ �����ڵ� ��������)
 * �׸��� �غ��� ���� ������ ������ �� �ִ� �޼ҵ�� �ﰢ���� ���̸� ����ؼ� ��ȯ�ϴ� �޼ҵ嵵 �Բ� 
 */
class Triangle {
    double bottom;
    double height;
    
    public Triangle(double bt, double hg) {
        bottom = bt;
        height = hg;
    }
      
    public void setBottom(double bt) {
        bottom = bt;
    }
    
    public void setHeight(double hg) {
        height = hg;
    }
    
    public double getArea() {
        return bottom * height / 2;
    }
}
public class Ex07_01 {
    public static void main(String[] args) {
        Triangle tr = new Triangle(10.2, 17.3);
        System.out.println("�ﰢ���� ����: " + tr.getArea());
        
        tr.setBottom(7.5);
        tr.setHeight(9.2);
        System.out.println("�ﰢ���� ����: " + tr.getArea());	
    }
}
