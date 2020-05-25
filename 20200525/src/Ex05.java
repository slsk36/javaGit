import java.sql.Connection;			//�������� ��ü
import java.sql.DriverManager;
import java.sql.PreparedStatement;	//sql�� ��� ��
import java.sql.ResultSet;			//table ���� ��� ��ü


public class Ex05 {
	Ex05(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//���ܰ� �������� �����ϴ� ����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HR","1234");
			
			pstmt = conn.prepareStatement("select*from a");
			rs= pstmt.executeQuery();
			
//			rs.next();
//			System.out.println("rs.get(1)= " +rs.getString(1));
//			System.out.println("rs.get(2)= " +rs.getString(2));
//			
//			rs.next();
//			System.out.println("rs.get(1)_2= " +rs.getString(1));
//			System.out.println("rs.get(2)_2= " +rs.getString(2));
			
			while(rs.next()) {
				System.out.println("rs.get(1)= " +rs.getString(1));
				System.out.println("rs.get(2)= " +rs.getString(2));
			}
			
			System.out.println("���������� DB���� ����");
		}
		catch(Exception e) {
			e.printStackTrace();
			//���� �߻� ������ ó���ϴ� ����
		}
		finally {
			//���ܰ� �߻��ϵ� �Լ��� ����ǵ� ������ �����ϴ� ����
			try {
			if(conn != null)
				conn.close();
			if(pstmt != null)
				pstmt.close();
			if(rs != null)
				rs.close();
			}
			catch(Exception e) {}
		}
	}
	
	public static void main(String[] args) {
		new Ex05();
	}
}
