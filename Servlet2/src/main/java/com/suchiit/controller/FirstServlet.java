package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		ServletContext context=getServletContext();
		
		context.setAttribute("fname", fname);
		context.setAttribute("lname", lname);
		PrintWriter out=response.getWriter();
		
	}

}
