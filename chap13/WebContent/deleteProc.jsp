<%@ page import="chap13.board.BoardDBBean"%>
<%@ page import="chap13.board.BoardDataBean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	int num = Integer.parseInt(request.getParameter("num")); //�ּ��ٿ� �ִ� ���� ��������
	String pageNum=request.getParameter("pageNum");
	
	
	BoardDBBean bdb = BoardDBBean.getInstance(); //DB �����ϴ� Ŭ����
	//bdb.deleteOne(Integer.parseInt(num));	//board ���̺�, �÷��� 1:1 mapping
	
%>
<meta http-equiv="Refresh" content="0;url=index.jsp?pageNum=<%= pageNum %>">