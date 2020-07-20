package com.mh.org.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mh.value.ConValues;

public class Datasource {

	public static Connection getConnetction() {
		//DB연결 함수(반복되는 내용은 함수처리하기 )
					Connection conn = null;
					try {
						Class.forName(ConValues.sqlClass);
						conn = DriverManager.getConnection(ConValues.sqlUrl, ConValues.sqlUser, ConValues.sqlPass);
					}
					catch(Exception e) {
						e.printStackTrace();
					}
					return conn;
				}
	
	
	public static void doClose(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		//DB close함수	
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				
			}
		}
	
	}

