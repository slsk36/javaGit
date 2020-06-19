import java.util.Scanner;

class Point { 
    int xPos, yPos;

    public Point(int x, int y) {
        xPos = x;
        xPos = y;
    }

    public void showPointInfo() { 
        System.out.println("[" + xPos + ", " + yPos + "]"); 
    }
}

class Circle
{
    int rad;	// ������
    Point center;    // ���� �߽�
    
    public Circle(int x, int y, int r) {
        center = new Point(x, y);
        rad = r;
    }
    
    public void showCircleInfo() {
        System.out.println("radius: " + rad);
        center.showPointInfo();
    }
}

class UseCircle {
    public static void main(String[] args) {
        int x,y,r;
    	// ��ǥ [2, 2] ������ 4�� ���� ����
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("��ǥ�� �Է��ϼ���");
    	x = scan.nextInt();
    	y = scan.nextInt();
    	System.out.println("������ ");
    	r = scan.nextInt();
        Circle c = new Circle(x, y, r);

        // ���� ���� ���
        c.showCircleInfo();
    }
}
