<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="chap13.board.BoardDataBean" %>
<%@ page import="chap13.board.BoardDBBean" %>
<%
	BoardDBBean bdb = BoardDBBean.getInstance();
	List<BoardDataBean> list = bdb.selectALL();
// 	for(BoardDataBean temp : list){
// 		out.print(temp);
// 	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<jsp:include page="header.jsp"></jsp:include>

</head>
<body>

	<div class="container">
		<nav class="navbar navbar-expand-sm bg-primary navbar-light">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link"	href="deleteForm.jsp">Delete</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="updateForm.jsp">Update</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="view.jsp">List</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="writeForm.jsp">Write</a>
				</li>
			</ul>
		</nav>
		<div class="row">
			<div class="col">
				<table class="table table-Bordered">
				<tr>
					<th>번호</th>
					<th>작성자</th>
					<th>이메일</th>
					<th>제목</th>
					<th>작성일자</th>
					<th>조회수</th>
				</tr>
				<%
					for(BoardDataBean temp : list){
						out.print("<tr onclick='row("+temp.getNum()+");'>");
						out.print("<td>");
						out.print(temp.getNum());
						out.print("</td>");
						
						out.print("<td>");
						out.print(temp.getWriter());
						out.print("</td>");
						
						out.print("<td>");
						out.print(temp.getEmail());
						out.print("</td>");
						
						out.print("<td>");
						out.print(temp.getSubject());
						out.print("</td>");
						
						out.print("<td>");
						out.print(temp.getReg_date());
						out.print("</td>");
						
						out.print("<td>");
						out.print(temp.getReadcount());
						out.print("</td>");
						
						
						out.println("</tr>");
					}
				%>
				</table>
			</div>
		</div>
	</div>

</body>
</html>

<script>
	function row(num){location.href="view.jsp?num="+num;};
</script>

<!-- 
	jsp = html + css, javascript + java + database
	tomcat 환경 -> tomcat 실행 console 톰캣
	
	내컴퓨터(이클립스)	->	관리(서비스)	->	실제서버(192.168.0.200)
 -->