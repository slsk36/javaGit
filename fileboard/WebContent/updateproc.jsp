<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.io.File"%>
<%@ page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page import="java.util.Enumeration"%>
<%@ page import="com.mh.file.FileBoardDTO"%>
<%@ page import="com.mh.file.FileBoardDAO"%>
<%
	FileBoardDTO fdto = new FileBoardDTO();

	fdto.setContent(request.getParameter("content"));
	fdto.setTitle(request.getParameter("title"));
	fdto.setIdx( Integer.parseInt(request.getParameter("idx")) );

	FileBoardDAO fbd = FileBoardDAO.getInstance();
	out.println("fdto = "+ fdto);
	fbd.updateFileBoard(fdto);
	
// 	response.sendRedirect("index.jsp");
%>