<%@ page import="chap13.board.BoardDBBean"%>
<%@ page import="chap13.board.BoardDataBean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	int num = Integer.parseInt(request.getParameter("num")); //주소줄에 있는 숫자 가져오기
	String pageNum=request.getParameter("pageNum");
	
	
	BoardDBBean bdb = BoardDBBean.getInstance(); //DB 관리하는 클래스
	//bdb.deleteOne(Integer.parseInt(num));	//board 테이블, 컬럼이 1:1 mapping
	
%>
<meta http-equiv="Refresh" content="0;url=index.jsp?pageNum=<%= pageNum %>">