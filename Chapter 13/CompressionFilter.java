package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.zip.GZIPOutputStream;

public class CompressionFilter implements Filter { 
	private ServletContext ctx;
	private FilterConfig cfg;
	
	public void init(FilterConfig cfg)
			throws ServletException {
		this.cfg = cfg;
		ctx = cfg.getServletContext();
		ctx.log(cfg.getFilterName() + " initialized.");
			
	}
	
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain fc)
			throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		
		String valid_encodings = request.getHeader("Accept-Encoding");
		if (valid_encodings.indexOf("gzip") > -1) {
			
			CompressionResponseWrapper wrapperResp = new CompressionResponseWrapper(response);
			wrapperResp.setHeader("Content-Encoding", "gzip");
			
			fc.doFilter(request, wrapperResp);
			
			GZIPOutputStream gzos = wrappedResp.getGZIPOutputStream();
			gzos.finish();
			
			ctx.log(cfg.getFilterName() + ": finished the request.");
			
		} else {
			ctx.log(cfg.getFilterName() + ": no encoding performed.");
			fc.doFilter(request, response);
		}
	}
	public void destroy() {
		//nulling out my instance variables
		cfg = null;
		ctx = null;
	}
}
