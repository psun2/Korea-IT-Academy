package com.lec.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/InitS" }, 
initParams = { 
		@WebInitParam(name = "id", value = "test"),
		@WebInitParam(name = "pw", value = "1004"), 
		@WebInitParam(name = "local", value = "busan") })
public class InitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InitServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ServletConfig 의 메소드 사용
		String id = getInitParameter("id");
		String pw = getInitParameter("pw");
		String local = getInitParameter("local");

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("id: " + id + "<br />");
		out.println("pw: " + pw + "<br />");
		out.println("local: " + local + "<br />");
		out.close();
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
