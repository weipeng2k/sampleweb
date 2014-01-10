/**
 * 
 */
package com.murdock.sample.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author weipeng2k 2014年1月8日 下午1:43:53
 */
public class SampleServlet extends HttpServlet {

	private static final long serialVersionUID = -3749534212151928963L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		resp.getWriter().println("Hello");
		resp.getWriter().println();
		resp.getWriter().flush();
	}

}
