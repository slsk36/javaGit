<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="chap13.board.BoardDBBean"%>
<%@ page import="chap13.board.BoardDataBean"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 삭제 하시겠습니까?
<button onclick="doBack();">취소</button>
<button id="deleteProc">삭제</button>
</body>
</html>

<script>
function doBack(){
	window.history.back();
}</script>