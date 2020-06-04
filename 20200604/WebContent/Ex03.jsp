<%@page import="java.util.Iterator"%>
<%@page import="com.nh.org.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>

<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	Student st1 = new Student();
	st1.setGender("남");
	st1.setStu_number(1);
	st1.setRemark("이름이");
	
	Student st2 = new Student();
	st2.setGender("여");
	st2.setStu_number(2);
	st2.setRemark("이름은");


	ArrayList<Student> al = new ArrayList();
	al.add(0, st1);
	al.add(1, st2);
	al.add(2, st2);
	al.add(3, st2);
	
	Iterator<Student> itt = al.iterator();
	while(itt.hasNext()){
		System.out.println(itt.next());
	}
	
	al.remove(3); //3번째만 지움
	al.clear(); //싹다 지움
%>
<ul class="list-group">
<%	
// 	for(Student student : al ){
	for(int i=0; i<al.size();i++){
		Student student = (Student) al.get(i);
%>
	<li class="list-group-item list-group-item-info"><% out.println(student); %></li>

<%
	}
%>
</ul>

</body>
</html>