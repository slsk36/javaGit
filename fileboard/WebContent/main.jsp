<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="top.jsp" %>
<div>
	<h1>메인</h1>
	메인 안에서 top.jsp 와<br/>
	bottom.jsp를 포함한다.
</div>
<%@ include file="bottom.jsp" %>
</body>
</html>