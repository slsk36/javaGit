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
		����<input type="text" name="title"/><br/>
		����<textarea name="content"></textarea><br/>
		÷��<input type="file" name="file"/>
		<!--÷�ε� ���ϰ��==>> D:\2020java\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\fileboard\upload -->
		<input type="submit" value="����"/>
	</div>
</form>
</body>
</html>