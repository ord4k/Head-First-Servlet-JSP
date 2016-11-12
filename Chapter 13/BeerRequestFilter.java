package com.example.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;

public class BeerRequestFilter implements Filter {
	
	private FilterConfig fc;
	
	public void init(FilterConfig config) throws ServletException {
		
		this.fc = config;
	}
			
	public void doFilter(ServletRequest req, ServletResponse resp, FIlterChain chain)
					throws ServletException, IOException {
				
		HttpServletRequest httpReq = (HttpServletRequest) req;
				
		String name = http.req.getRemoteUser();
				
		if (name != null) {
			fc.getServletContext().log("user" + name " " is updating");
		}
			
		chain.doFilter(req, resp);
	}
			
	public void destroy() {
				// do clenup
	}
}


	
