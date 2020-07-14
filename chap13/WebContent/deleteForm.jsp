<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="chap13.board.BoardDBBean"%>
<%@ page import="chap13.board.BoardDataBean"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<jsp:include page="header.jsp"></jsp:include>
</head>

<body>
<p>글삭제</p>
<br>
<form method="POST" name="delForm" action="deleteProc.jsp?pageNum=<%= page %>"
onsubmit="return deleteSave()">
<table>
<tr height="30">
	<input type="submit" value="글삭제">
	<input type="button" value="글목록" onclick="document.location.href='index.jsp?pageNum=<%= page %>'"> 
</table>
</form>
	<!--  
	 삭제 하시겠습니까?
	<button onclick="doBack();">취소</button>
	<button id="deleteProc">삭제</button>
	-->
</body>
</html>

<script>
function doBack(){
	window.history.back();
	}
	$("#deleteProc").on("click",function(){
	location.href="index.jsp?";
	});
</script>