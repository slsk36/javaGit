package com.mh.org.freeboard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mh.org.util.Datasource;

public class FreeBoardDAO {

	public List<FreeBoardDTO> selectALL(){
		List<FreeBoardDTO> list = new ArrayList<FreeBoardDTO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = Datasource.getConnetction();
			pstmt = conn.prepareStatement("select * from freeboard");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				FreeBoardDTO dto = new FreeBoardDTO(
						rs.getInt("idx"),
						rs.getString("title"),
						rs.getString("content"),
						rs.getString("reg_date"),
						rs.getString("mod_date")
						);
				list.add(dto);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			Datasource.doClose(rs, pstmt, conn);
		}
		return list;
	}
}
