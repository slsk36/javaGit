<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="chap13.board.BoardDBBean" %>
<%@ page import="chap13.board.BoardDataBean" %>
<%
	//request.getParameter(주소줄에 있는 데이터 값을 가져오는 함수)
	String sub = request.getParameter("subject");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String content = request.getParameter("content");
	String passwd = request.getParameter("passwd");
	
	System.out.println(sub);
	System.out.println(name);
	System.out.println(email);
	System.out.println(content);
	System.out.println(passwd);


	BoardDataBean dataBean = new BoardDataBean();
	dataBean.setContent(content);
	dataBean.setWriter(name);
	dataBean.setEmail(email);
	dataBean.setPasswd(passwd);
	dataBean.setSubject(sub);
// 	dataBean.setSubject(sub);
// 	out.println("sub = "+ sub);
// 	out.println(dataBean);

	BoardDBBean bdb = BoardDBBean.getInstance();
	bdb.insertArticle(dataBean);
	
	out.println("writePro.jsp");
	
%>