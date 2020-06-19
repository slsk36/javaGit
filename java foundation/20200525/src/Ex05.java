import java.sql.Connection;			//연결유지 객체
import java.sql.DriverManager;
import java.sql.PreparedStatement;	//sql을 담는 객
import java.sql.ResultSet;			//table 내용 담는 객체


public class Ex05 {
	Ex05(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//예외가 나오는지 관찰하는 영역
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
			
			System.out.println("정상적으로 DB연결 성공");
		}
		catch(Exception e) {
			e.printStackTrace();
			//예외 발생 했을때 처리하는 영역
		}
		finally {
			//예외가 발생하든 함수가 종료되든 무조건 실행하는 영역
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