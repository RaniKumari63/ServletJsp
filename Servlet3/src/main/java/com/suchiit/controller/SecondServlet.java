package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context=getServletContext();
		
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String city=request.getParameter("city");
		String country=request.getParameter("country");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println(fname+"\t"+lname+"\t"+city+"\t"+country);
	}

}
