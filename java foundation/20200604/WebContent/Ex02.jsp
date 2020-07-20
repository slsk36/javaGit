<%@ page import="com.nh.org.Box"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		Box<String> box = new Box();
		box.setO("문자열");
		
		String outBox = box.getO();
		out.println("outBox = "+outBox);
		
		
		Box<Integer> box1 = new Box();
		box1.setO(123);
		
		String outBox1 = box.getO();
		out.println("outBox = "+outBox1);
	%>
</body>
</html>