<%@page import="com.mh.file.FileBoardDTO"%>
<%@page import="com.mh.file.FileBoardDAO"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

	FileBoardDTO fdto = new FileBoardDTO();

	String filepath = application.getRealPath("/upload/");

	File file = new File(filepath);
	
	if(!file.exists()){
		file.mkdirs();
	} //파일이 존재하지 않으면 파일을 만들어 달라
	
	MultipartRequest mr = new MultipartRequest(
			request,
			filepath,
			1024*1024*10,
			"utf-8",
			new DefaultFileRenamePolicy()
			);
	
	Enumeration<?> params = mr.getParameterNames();
	
	while(params.hasMoreElements()){
		String name =(String)params.nextElement();
		String value = mr.getParameter(name);
		
		out.println("name = "+name+" value = "+value+"<br/>");
	}
	
	Enumeration<?> enums = mr.getFileNames();
	
	while(enums.hasMoreElements()){
		String name =(String)enums.nextElement();
		//서버쪽 이름
		String serverfilename = mr.getFilesystemName(name);
		//클라이언트쪽 이름
		String clientfilename = mr.getOriginalFileName(name);
		
		String type = mr.getContentType(name);
		
		File cfile = mr.getFile(name);
		
		out.println("파라메터 이름: "+name+"<br/>");
		out.println("서버 이름: "+serverfilename+"<br/>");
		out.println("클라이언트 이름: "+clientfilename+"<br/>");
		out.println("파일 크기: "+cfile.length()+"<br/>");
		
		fdto.setFilename(serverfilename);
		fdto.setTitle(mr.getParameter("title"));
		fdto.setContent(mr.getParameter("content"));
	}
	
	FileBoardDAO fbd = new FileBoardDAO();
	fbd.insertFileBoard(fdto);
%>    

<!-- <!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html> -->