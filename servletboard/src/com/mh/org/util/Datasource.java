package com.mh.org.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mh.value.ConValues;

public class Datasource {

	public static Connection getConnetction() {
		//DB���� �Լ�(�ݺ��Ǵ� ������ �Լ�ó���ϱ� )
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
		//DB close�Լ�	
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				
			}
		}
	
	}

