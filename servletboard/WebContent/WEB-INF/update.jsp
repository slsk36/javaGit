<%@ page import="com.mh.org.freeboard.FreeBoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../resources/cssjs/Head.jsp" %>
<script type="text/javascript">
$(document).ready(function(){
	
});
</script>


</head>
<body>

	<div class="container">
	<h1>글수정</h1>
		<div class="row" style="height:400px;">
		<form action="updateproc.ws">
		<input type="hidden" name="idx" value="${dto.idx}"/>
		<table class="table">
			<tr>
				<th>제목</th>
				<td><input class="form-control" type="text" name="title" value="${dto.title}"/></td>
			</tr>
			<tr>
				<th colspan="2" style="text-align:center;">내용</th>
			</tr>
			<tr>
				<td colspan="2"><textarea class="form-control" rows="5" id="comment" name="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align:center;">
				<input type="submit" class="btn btn-success" value="저장"/>
				<input type="reset" class="btn btn-success" value="취소"/>
				</td>
			</tr>
		</table>
		</form>
		</div>
		<div class="row">
		<button id="insert" type="button" class="btn btn-success">글목록</button>
		</div>
	</div>
</body>
</html>













