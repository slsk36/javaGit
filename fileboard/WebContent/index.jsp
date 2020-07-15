<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.mh.file.FileBoardDAO" %>
<%@ page import="com.mh.file.FileBoardDTO" %>
<%@ page import="java.util.List" %> 
<%
	//FileBoardDAO dao1 = new FileBoardDAO();
	FileBoardDAO dao = FileBoardDAO.getInstance();
	
	List<FileBoardDTO> list = dao.selectAllFileBoard(); //fileboard안에있는 모든 행의 내용을 가져옴
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="uploadproc.jsp" method="post" enctype="multipart/form-data">
	<h1>file upload</h1>
	<div>
		제목<input type="text" name="title"/><br/>
		내용<textarea name="content"></textarea><br/>
		첨부<input type="file" name="file"/>
		<!--첨부된 파일경로==>> D:\2020java\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\fileboard\upload -->
		<input type="submit" value="저장"/>
	</div>
</form>
<div>
	<table border="1">
		<tr>
			<th>idx</th>
			<th>title</th>
			<th>content</th>
			<th>filename</th>
		</tr>
		<%
			for(int i=0; i<list.size(); i++){
				FileBoardDTO fdto = list.get(i);
				out.println("<tr>");
				out.println("<td>"+fdto.getIdx()+"</td>");
				out.println("<td>"+fdto.getTitle()+"</td>");
				out.println("<td>"+fdto.getContent()+"</td>");
				out.println("<td><img width=\"150\" src=\"/fileboard/upload/"+fdto.getFilename()+"\"/></td>");
				out.println("</tr>");
			}
		%>
		
		<tr>
			<td>111</td>
			<td>222</td>
			<td>333</td>
			<td><img width="150" src="/fileboard/upload/Tulips.jpg"/></td>
		</tr>
	</table>
</div>
</body>
</html>