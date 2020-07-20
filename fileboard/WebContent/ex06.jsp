<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! //전역변수 class로 간다.
	String a="a";
	public void doA(){
		System.out.println("a= "+a);
	}
%>

<% //지역변수 jsp.service라는 메서드 공간으로 빠지게 된다.
	String b="b";
%>


<%=a%>
<%=b%>
<% doA();%> <!-- 콘솔에서 a=a로 나옴 -->
<!--ex06_jsp.java파일 생성됨 경로===>>>>> D:\2020java\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\fileboard\org\apache\jsp  -->
</body>
</html>