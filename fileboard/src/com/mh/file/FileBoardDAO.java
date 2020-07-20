package com.mh.file;

///DAO파일은 singleton 으로 하나만 생성

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
	
	private FileBoardDAO() {}
	
//DB close함수	
	public void doClose(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}catch(Exception e) {
			
		}
	}
//DB연결 함수(반복되는 내용은 함수처리하기 )
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
	
	
	//cks[0]=18
	//cks[1]=17
	public void deleteFileBoard(String[] cks) {
		String deletIdxs ="";
		for(int i=0; i<cks.length; i++) {
			//마지막 숫자가 아닐때는 콤마를 넣어주고 아닐때는 콤마넣지 말게 조건문
			if(i==(cks.length-1))
				deletIdxs = deletIdxs + " " +cks[i];
			else
				deletIdxs = deletIdxs + " " +cks[i]+",";
		}
		System.out.println(deletIdxs);
		
		Connection conn = null;
		PreparedStatement pstmt=null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("delete from fileboard where idx in("+deletIdxs+")");
			pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			doClose(null, pstmt, conn);
		}
		
	}
	
//수정	
	public void updateFileBoard(FileBoardDTO fdto) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("update fileboard set title = ?. content=? where idx=? ");
			pstmt.setString(1, fdto.getTitle());
			pstmt.setString(2, fdto.getContent());
			pstmt.setInt(3, fdto.getIdx());
			
			pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			doClose(null, pstmt, conn);
		}
		
	}
	
	public List<FileBoardDTO> selectAllFileBoard(){
		List<FileBoardDTO> list = new ArrayList<FileBoardDTO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
				
		try {
			conn=getConnection();
			pstmt = conn.prepareStatement("select * from fileboard order by idx desc");
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
	
	@SuppressWarnings("resource")
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
			
			pstmt = conn.prepareStatement("insert into fileboard (title,content,filename,idx) values (?,?,?,?)"); //1,2,3,4번째 파라미터
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
