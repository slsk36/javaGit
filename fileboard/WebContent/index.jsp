<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
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
</body>
</html>