package com.mh.file;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FileBoardDAO {
	
	private static FileBoardDAO dao = new FileBoardDAO();
	
	public static FileBoardDAO getInstance() {
		return dao;
	}
//DB close함수	
	public void doClose(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}catch(Exception e) {
			
		}
	}
//반복되는 내용은 함수처리하기 DB연결 함수
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(CVALUES.sqlClass);
			conn = DriverManager.getConnection(CVALUES.sqlUrl, CVALUES.sqlUser, CVALUES.sqlPass);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public List<FileBoardDTO> selectAllFileBoard(){
		List<FileBoardDTO> list = new ArrayList<FileBoardDTO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
				
		try {
			conn=getConnection();
			pstmt = conn.prepareStatement("select * from fileboard");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				FileBoardDTO fdto = new FileBoardDTO();
				fdto.setContent(rs.getString("content"));
				fdto.setTitle(rs.getString("title"));
				fdto.setFilename(rs.getString("filename"));
				fdto.setIdx(rs.getInt("idx"));
								
				list.add(fdto);
			}
		}
		catch(Exception e) {}
		finally {
			doClose(rs, pstmt, conn);
		}
		return list;
		
	}
	
	public void insertFileBoard(FileBoardDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		int idx=0;
		
		try {
			conn=getConnection();
			
			System.out.println("dto= " +dto.toString());
			
			pstmt = conn.prepareStatement("exec PRO_SEQS 'FILE_BOARD_SEQ'");
			pstmt.setEscapeProcessing(true);
			rs= pstmt.executeQuery();
			if(rs.next()) {
				idx=rs.getInt("value");
				System.out.println("idx= "+idx);
			}
			
			pstmt = conn.prepareStatement("insert into fileboard " + 
					"(title,content,filename,idx) " + 
					"values " + 
					"(?,?,?,?)"); //1,2,3,4번째 파라미터
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContent());
			pstmt.setString(3, dto.getFilename());
			pstmt.setInt(4, idx);
			pstmt.executeUpdate();
		}
		catch(Exception e) {
			
		}
		finally {
			doClose(rs, pstmt, conn);
		}
	}
}
