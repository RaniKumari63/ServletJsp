package com.suchiit.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class MyFilter
 */
public class MyFilter extends HttpFilter implements Filter {
  
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<body bgcolor=yellow>");
		out.println("<center><b><br><br>");
		int age=Integer.parseInt(request.getParameter("sage"));
		if(age<18)
		{
		out.println("U R not allowed for this Fashion Show");
		out.println("<br><br>");
		out.println("Bcoz, U R minor");
		out.println("<br><br>");
		out.println("Try after few years");
		out.println("<br><br>");
		out.println("<a href='studentform.html'>New StudentForm</a>");
		}
		else{
		chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
