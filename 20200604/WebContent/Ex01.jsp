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
	
// 	Connection conn = null; //DB������ �����ϴ� ��ü
// 	PreparedStatement pstmt = null; 
	
// 	try{
// 		//class ojdbc6.jar ���Ͼȿ� �ִ� Driver class�� ã��
// 		Class.forName("oracle.jdbc.driver.OracleDriver"); //����Ŭ�� DB����
// 		//DB���� �����Ǹ� ������н� catch���ܷ�
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