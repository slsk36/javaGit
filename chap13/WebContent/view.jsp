<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="chap13.board.BoardDBBean"%>
<%@ page import="chap13.board.BoardDataBean"%>

<%
	String num = request.getParameter("num");

	BoardDBBean bdb = BoardDBBean.getInstance();
	BoardDataBean one = bdb.selectOne( Integer.parseInt(num));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<jsp:include page="header.jsp"></jsp:include>

</head>
<body>
	<form action="writePro.jsp" id="frm" method="get">
		<!-- 		<div class="container" style="background-color: blue;"> -->
		<div class="container bg-mycolor">
			<div class="row">
				<div class="col">
					<h1>글보기</h1>
				</div>
			</div>
			<div class="row">
				<div class="col-md-2 myborder myright">이름</div>
				<div class="col-md-10 myborder">
				<% out.print(one.getWriter()); %></div>
			</div>
			<div class="row">
				<div class="col-md-2 myborder myright">제목</div>
				<div class="col-md-10 myborder">
				<% out.print(one.getSubject()); %></div>
			</div>
			<div class="row">
				<div class="col-md-2 myborder myright">Email</div>
				<div class="col-md-10 myborder">
				<% out.print(one.getEmail()); %></div>
			</div>
			<div class="row" style="height:256px;">
				<div class="col-md-2 myborder myright">내용</div>
				<div class="col-md-10 myborder">
				<% out.print(one.getContent()); %></div>
			</div>
			<div class="row">
				<div class="col-md-2 myborder myright">비밀번호</div>
				<div class="col-md-10 myborder"></div>
			</div>
			<div class="row">
				<div class="col-md-12 mycenter">
					<input type="button" value="글수정" id="updateBtn" /> 
					<input type="button" value="글삭제 " id="deleteBtn" /> 
					<input type="button" value="목록보기" id="indexBtn" />
				</div>
			</div>
		</div>
	</form>
</body>
</html>

<
<script>
	$("#updateBtn").on("click",function(){ window.location="updateForm.jsp";});
	$("#deleteBtn").on("click",function(){ window.location="deleteForm.jsp?num=<% out.print(one.getNum());%>";});
	$("#indexBtn").on("click",function(){ window.location="index.jsp";});
// 	$("#writeBtn").on("click", function() {$("#frm").submit();})
</script>

