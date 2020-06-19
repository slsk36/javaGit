package com.nh.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MyOracle {
	
	public String doUpdate() {
		System.out.println("doupdate");
		Connection conn = null; //DB연결을 유지하는 객체
		PreparedStatement pstmt = null; 
		
		try{
			//class ojdbc6.jar 파일안에 있는 Driver class를 찾음
			Class.forName("oracle.jdbc.driver.OracleDriver"); //오라클에 DB연결
			//DB연결 성공되면 진행실패시 catch예외로
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HR","1234");
			pstmt = conn.prepareStatement("UPDATE student set stu_number = 3 ");
			
			pstmt.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return "정상 업데이트 완료";
	}
}

//import정리 c+s+o
