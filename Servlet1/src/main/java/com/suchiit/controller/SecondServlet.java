package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname=(String)request.getAttribute("fname");
		String lname=(String)request.getAttribute("lname");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println(fname+"\t"+lname);
	}

}
