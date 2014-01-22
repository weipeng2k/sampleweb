package com.murdock.sample.web.servlet;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SlowServlet extends HttpServlet {

	private static final long serialVersionUID = -3749534212151928963L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String value = req.getParameter("s");
		long sleeptime = 30;
		if (value != null) {
			sleeptime = Long.parseLong(value.trim());
		}
		try {
			TimeUnit.SECONDS.sleep(sleeptime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		resp.getWriter().println("Hello");
		resp.getWriter().println();
		resp.getWriter().flush();
	}

}
