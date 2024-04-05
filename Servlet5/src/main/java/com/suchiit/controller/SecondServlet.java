package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context=getServletContext();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	HttpSession ses=request.getSession(false);
	String fname=(String)ses.getAttribute("fname");
	String lname=(String)ses.getAttribute("lname");
		String city=request.getParameter("city");
		String country=request.getParameter("country");
		
		out.println(fname+"\t"+lname+"\t"+city+"\t"+country);
	}

}
