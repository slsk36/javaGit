import java.util.Scanner;

/*
 * 밑변과 높이 정보를 저장할 수 있는 Triangle 클래스를 정의하자(그 안에 적절한 생성자도 정의하자)
 * 그리고 밑변과 높이 정보를 변경할 수 있는 메소드와 삼각형의 넓이를 계산해서 반환하는 메소드도 함께 
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
        System.out.println("삼각형의 넓이: " + tr.getArea());
        
        tr.setBottom(7.5);
        tr.setHeight(9.2);
        System.out.println("삼각형의 넓이: " + tr.getArea());	
    }
}
