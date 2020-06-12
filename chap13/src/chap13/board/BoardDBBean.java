package chap13.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardDBBean {
	private static BoardDBBean instance = new BoardDBBean();
	
	private BoardDBBean() {}
	
	public static BoardDBBean getInstance() {
		return instance;
	}
	
	public String doA() {
		return "연결";
	}
	
	public void insertArticle(BoardDataBean dataBean) {
		System.out.println(dataBean);
		Connection conn = null;
		PreparedStatement pstmt = null; //insert select update delete 담는 객체 
		// jar파일 관리회사 maven, gradle
		//jar파일 연결되있는지 확인 class.forName();
		//Connection 객체 연결 Drvernamager.getConnection();
		//prepareStatement 생성 conn.prepareStatement();
		//실행
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection("jdbc:sqlserver://192.168.0.200:1433;database=nn_20200611","sa","8765432!");
//			System.out.println("DB연결 성공");
			pstmt =  conn.prepareStatement("INSERT INTO [dbo].[board]" + 
					"           ([num]" + 
					"           ,[writer]" + 
					"           ,[email]" + 
					"           ,[subject]" + 
					"           ,[passwd]" + 
					"           ,[red_date]" + 
					"           ,[readcount]" + 
					"           ,[ref]" + 
					"           ,[re_step]" + 
					"           ,[re_level]" + 
					"           ,[content]" + 
					"           ,[ip])" + 
					"     VALUES" + 
					"           ((select max(num)+1 as num from board)" + 
					"           ,?" + 
					"           ,?" + 
					"           ,?" + 
					"           ,?" + 
					"           ,getdate()" + 
					"           ,0" + 
					"           ,0" + 
					"           ,0" + 
					"           ,0" + 
					"           ,?" + 
					"           ,'192.168.0.198')");
			
			pstmt.setString(1, dataBean.getWriter());
			pstmt.setString(2, dataBean.getEmail());
			pstmt.setString(3, dataBean.getSubject());
			pstmt.setString(4, dataBean.getPasswd());
			pstmt.setString(5, dataBean.getContent());
			

			
			pstmt.executeUpdate();
			System.out.println("insert성공");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertDetailArticle(String name, String sub, String email, String content, String passwd) {
		System.out.println(name);
		System.out.println(email);
		System.out.println(sub);
		System.out.println(content);
		System.out.println(passwd);
		
		
		
	}
}
