package com.mh.org;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import javax.servlet.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//서블릿 파일을 못만들어 불러와서 톰캣을 다시 새로 다운받아서 깔았다.
//알수없는 오류시에 톰캣의 파일위치를 확인할 것

import com.mh.org.freeboard.FreeBoardDAO;
import com.mh.org.freeboard.FreeBoardDTO;

@WebServlet(urlPatterns = {"*.ws"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	FreeBoardDAO dao = new FreeBoardDAO();
	
    public Controller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TEST TEST");
		String url = request.getRequestURL().toString();
		url = url.substring(url.lastIndexOf("/"));
		if(url.equals("/a.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/a.jsp");
			request.setAttribute("hello", "this is servlet");
			rd.forward(request, response);
		}
		else if( url.equals("/b.ws") ) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/b.jsp");
			rd.forward(request, response);
		}
		else if( url.equals("/c.ws") ) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/c.jsp");
			rd.forward(request, response);
		}
		else if( url.equals("/index.ws") ) {
			// jstl 서블릿으로 
//			List<String> list = new ArrayList<String>();
//			list.add("aaa");
//			list.add("bbb");
//			list.add("ccc");
//			
//			request.setAttribute("list", list);
			
			List<FreeBoardDTO> list = dao.selectALL();
			request.setAttribute("list", list);
			
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/index.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
