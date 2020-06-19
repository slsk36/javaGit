package chap13.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDBBean {
	private static BoardDBBean instance = new BoardDBBean();
	
	private String sqlserverClass= "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private String sqlserverUrl = "jdbc:sqlserver://192.168.0.200:1433;database=nn_20200611";
	private String sqlserverUser = "sa";
	private String sqlserverPw = "8765432!";
	
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
	
	public List<BoardDataBean> selectALL(){
		List<BoardDataBean> list = new ArrayList<BoardDataBean>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection("jdbc:sqlserver://192.168.0.200:1433;database=nn_20200611","sa","8765432!");
			pstmt = conn.prepareStatement("select top 10 * from  board order by num desc;");
			rs = pstmt.executeQuery();
			
			while (rs.next()) { //지금 현재 위치에서 다음행으로 보냄
				BoardDataBean bdb = new BoardDataBean();
				bdb.setContent(rs.getString("content"));
				bdb.setEmail(rs.getString("email"));
				bdb.setIp(rs.getString("ip"));
				bdb.setNum(rs.getInt("num"));
				bdb.setPasswd(rs.getString("passwd"));
				bdb.setRe_level(rs.getInt("re_level"));
				bdb.setRe_step(rs.getInt("re_step"));
				bdb.setReadcount(rs.getInt("readcount"));
				bdb.setRef(rs.getInt("ref"));
				bdb.setReg_date(rs.getTimestamp("red_date"));
				bdb.setSubject(rs.getString("subject"));
				bdb.setWriter(rs.getString("writer"));
				list.add(bdb);
			}
			return list;
//			System.out.println("DB연결 성공");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public BoardDataBean selectOne(int num) 
	{
		System.out.println("num: " +num);
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(sqlserverClass);
			conn = DriverManager.getConnection(sqlserverUrl,sqlserverUser,sqlserverPw);
			pstmt = conn.prepareStatement("select * from board where num= ?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				BoardDataBean bdb = new BoardDataBean();
				bdb.setContent(rs.getString("content"));
				bdb.setEmail(rs.getString("email"));
				bdb.setIp(rs.getString("ip"));
				bdb.setNum(rs.getInt("num"));
				bdb.setPasswd(rs.getString("passwd"));
				bdb.setRe_level(rs.getInt("re_level"));
				bdb.setRe_step(rs.getInt("re_step"));
				bdb.setReadcount(rs.getInt("readcount"));
				bdb.setRef(rs.getInt("ref"));
				bdb.setReg_date(rs.getTimestamp("red_date"));
				bdb.setSubject(rs.getString("subject"));
				bdb.setWriter(rs.getString("writer"));
				return bdb;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
