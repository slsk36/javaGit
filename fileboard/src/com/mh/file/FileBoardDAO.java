package com.mh.file;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FileBoardDAO {
	
	public void doClose(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}catch(Exception e) {
			
		}
	}

	public void insertFileBoard(FileBoardDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		int idx=0;
		
		try {
			Class.forName(CVALUES.sqlClass);
			conn = DriverManager.getConnection(CVALUES.sqlUrl, CVALUES.sqlUser, CVALUES.sqlPass);
			
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
