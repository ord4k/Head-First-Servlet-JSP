package com.example.web;

import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class BeerSelect extends HttpServlet {
	
	public void doPost(HttpServletRequest request,
					HttpServletResponse response)
					throws IOException, ServletException {
						
		String c = request.getParameter("color");
		BeerExpert be = new BeerExpert();
		List result = be.getBrands(c);
		
	//	response.setContentType("text/html");
	//	PrintWriter out = response.getWriter();
	//	out.println("Beer Selection Advice<br>");
	
		ServletContext context = getServletContext();
		String adminEmail = context.getInitParameter("adminEmail");
		
		request.setAttribute("styles", result);
		request.setAttribute("adminEmail", adminEmail);
		
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request,response);
		
	}		
}
