<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*" %>
<%@ page import="com.nh.org.MyOracle" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	MyOracle mo = new MyOracle();
	String msg = mo.doUpdate();
	out.println(msg);
	
	
// 	int a = 10;
// 	out.print("a= " +a);
	
// 	Connection conn = null; //DB연결을 유지하는 객체
// 	PreparedStatement pstmt = null; 
	
// 	try{
// 		//class ojdbc6.jar 파일안에 있는 Driver class를 찾음
// 		Class.forName("oracle.jdbc.driver.OracleDriver"); //오라클에 DB연결
// 		//DB연결 성공되면 진행실패시 catch예외로
// 		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HR","1234");
// 		pstmt = conn.prepareStatement("UPDATE student set stu_number = 3;");
		
// 		pstmt.executeUpdate();
// 	}
// 	catch(Exception e){
// 		e.printStackTrace();
// 	}
%>
</body>
</html>