package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
String sname=request.getParameter("sname");
int sage=Integer.parseInt(request.getParameter("sage"));
String saddr=request.getParameter("saddr");
out.println("<br><br>");
out.println("Hello Student..... Ur details are....");
out.println("<br><br>");
out.println("Name....."+sname);
out.println("<br><br>");
out.println("Name....."+sage);
out.println("<br><br>");
out.println("Name....."+saddr);
out.println("<br><br>");
out.println("Enjoy the Fashion show");
}
}
