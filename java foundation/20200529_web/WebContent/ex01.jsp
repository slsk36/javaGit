<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="ex01.jsp">

aa: <input type="text" name="aa">
bb: <input type="text" name="bb">
<input type="submit" value="insert 하기"/>
</form>
<%
	String a = request.getParameter("aa");
	String b = request.getParameter("bb");
	
	System.out.println("a= "+a);
	System.out.println("b= "+b);
	
	int aaa= 10;
	out.print("aaa= " +aaa);
	//Db연결 ojdbc jar 추가
	/*
		connection conn
	*/
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HR","1234");
		pstmt = conn.prepareStatement("insert into a values(?,?)" );
		
		pstmt.setString(1,a);
		pstmt.setString(2,b);
		pstmt.executeUpdate();
	}
	catch(Exception e){
		e.printStackTrace();
	}
%>
</body>
</html>