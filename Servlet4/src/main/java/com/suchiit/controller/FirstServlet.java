package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
		PrintWriter out=response.getWriter();
		Cookie ck=new Cookie("fname",fname);
		Cookie ck1=new Cookie("lname",lname);
		response.addCookie(ck);
		response.addCookie(ck1);
		ck1.setMaxAge(3000);
		ck.setMaxAge(0);
		out.println("<form action='second'>");
		out.println("<input type=text name='city' placeholder='Enter City Name'  "
				+ "/ >");
		out.println("<input type=text name='country' placeholder='Enter Country Name'/>");
		out.println("<input type=submit value='Clickme'");
		out.println("</form>");
		
	}

}
