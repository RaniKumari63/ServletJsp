package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suchiit.dao.StudentDao;
import com.suchiit.daoimpl.StudentDaoImpl;
import com.suchiit.model.Student;

/**
 * Servlet implementation class AddStudentServlet
 */
public class AddStudentServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		StudentDao daoimpl=new StudentDaoImpl();
		String sname=request.getParameter("sname");
		String sadd=request.getParameter("sadd");
		String semail=request.getParameter("semail");
		int cid=Integer.parseInt(request.getParameter("scid"));
		Student student = new Student( sname, sadd, semail,cid);
		boolean flag=daoimpl.registerStudent(student);
		out.println("<html>");
		out.println("<body>");
		if(flag)
		{

			out.println("<h3 style='color:blue;' >Student Inserted Successfully</h3>");

			out.println("<a href='studentform.jsp'>Home</a>");
			;
		}
		else
		{
			out.println("Student Not Inserted Successfully");
			out.println("<a href='studentform.jsp'>Home</a>");
		}
	}

}
