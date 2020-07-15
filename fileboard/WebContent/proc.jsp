<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%-- 페이지 디렉티브
	page -> jsp 설정정보와 import하는 것
	include -> 현재 jsp 페이지에서 다른 jsp 페이지를 포함
	taglib -> el,jstl 서블릿 기반에서 사용하기 때문에 ${ }를 사용하면 소스가 줄어든다 
--%>
<body>
<h1>jsp구문으로 request</h1>
<%
	String aparam = request.getParameter("a");
	String bparam = request.getParameter("b");
	
	out.println("aparam= "+aparam);
	out.println("bparam= "+bparam);
%>
<h1>el,jstl tag</h1>
${param.a}
${param.b}

</body>
</html>