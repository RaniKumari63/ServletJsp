package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suchiit.dao.CourseDao;
import com.suchiit.daoimpl.CourseDaoImpl;
import com.suchiit.model.Course;


/**
 * Servlet implementation class AddCourseServlet
 */
public class AddCourseServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CourseDao daoimpl=new CourseDaoImpl();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String cname=request.getParameter("cname");
		String cduration =request.getParameter("cduration");
		long cfee=Long.parseLong(request.getParameter("cfee"));
		Course course = new Course( cname, cduration, cfee);
		boolean flag=daoimpl.registerCourse(course);
		out.println("<html>");
		out.println("<body>");
		if(flag)
		{

			out.println("<h3 style='color:blue;' >Course Inserted Successfully</h3>");

			out.println("<a href='courseform.jsp'>Home</a>");
			;
		}
		else
		{
			out.println("Course Not Inserted Successfully");
			out.println("<a href='courseform.jsp'>Home</a>");
		}
	}

}
