package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context=getServletContext();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Cookie[] ck=request.getCookies();
		for(int i=0;i<ck.length;i++)
		{out.println(ck[i].getName()+"\t"+ck[i].getValue());
			
		}
		String city=request.getParameter("city");
		String country=request.getParameter("country");
		
		out.println(city+"\t"+country);
	}

}
