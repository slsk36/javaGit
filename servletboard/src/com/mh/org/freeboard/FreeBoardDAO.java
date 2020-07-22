package com.mh.org.freeboard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

import com.mh.org.util.Datasource;

import javafx.scene.chart.PieChart.Data;

public class FreeBoardDAO {

	public List<FreeBoardDTO> selectALL(int ipage, int lpage){
		List<FreeBoardDTO> list = new ArrayList<FreeBoardDTO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
//		페이징처리		
		try {
			conn = Datasource.getConnetction();
			pstmt = conn.prepareStatement("select * from ( " + 
					"select ROW_NUMBER() over (order by idx desc) rownum " +
					",* "+"from freeboard ) a "+
					"where rownum between ? and ?");

			pstmt.setInt(1, ipage);
			pstmt.setInt(2, lpage);
			
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
	
	public void insertFreeboard(FreeBoardDTO dto) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		conn = Datasource.getConnetction();
			
		int idx=0;
			
		pstmt = conn.prepareStatement("exec PRO_SEQS 'FREE_BOARD_SEQ'");
		pstmt.setEscapeProcessing(true);
		rs = pstmt.executeQuery();
		if(rs.next()) {
			idx = rs.getInt("value");
		}
		
		pstmt = conn.prepareStatement(
				"insert into freeboard"+
				"(idx,title,content,reg_date,mod_date) "+
				"values "+
				"(?,?,?,getdate(),getdate()) ");
		
		pstmt.setInt(1, idx);
		pstmt.setString(2, dto.getTitle());
		pstmt.setString(3, dto.getContent());
			
		pstmt.executeUpdate();
			
		Datasource.doClose(null, pstmt, conn);
	}

	public void deleteAll(String[] idx) throws Exception {
		String idxs="";
		for(int i=0; i<idx.length;i++) {
			if( (idx.length - 1) == i)
				idxs += idx[i];
			else
				idxs += idx[i]+",";
		}
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		conn = Datasource.getConnetction();
			
		pstmt = conn.prepareStatement("delete from freeboard " +
									"where idx in ("+ idxs +")");
		pstmt.executeUpdate();
		
		Datasource.doClose(null, pstmt, conn);
	}

	public FreeBoardDTO selectOne(String idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		FreeBoardDTO dto = null;
		try {
			conn = Datasource.getConnetction();
			pstmt = conn.prepareStatement("select * from freeboard where idx = ?");
			pstmt.setInt(1, Integer.parseInt(idx));
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto = new FreeBoardDTO(rs.getInt("idx"), 
							rs.getString("title"), 
							rs.getString("content"), 
							rs.getString("reg_date"), 
							rs.getString("mod_date")
							);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			Datasource.doClose(rs, pstmt, conn);
		}
		return dto;
	}
	
	public void updateFreeBoard(FreeBoardDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = Datasource.getConnetction();
			pstmt = conn.prepareStatement("update freeboard set tilte =?, content=?, mod_date=getdate() where idx = ?");
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContent());
			pstmt.setInt(3, dto.getIdx());
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			Datasource.doClose(null, pstmt, conn);
		}
	}

	public int selectPageCount() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = Datasource.getConnetction();
			pstmt = conn.prepareStatement("select count(*) from freeboard");
			rs = pstmt.executeQuery();
			if(rs.next()) {
				int rowcount = rs.getInt(1);
				System.out.println("rowcount ="+rowcount );
				int pagecount = rowcount / 10;
				if(rowcount%10 > 0) {
					pagecount = pagecount +1;
				}
				System.out.println("pagecount ="+pagecount );
				return pagecount;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			Datasource.doClose(rs, pstmt, conn);
		}
		return 0;
	}
}
