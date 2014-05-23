/**
 * 
 */
package com.murdock.sample.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.murdock.sample.web.service.WeiPengService;


/**
 * @author weipeng2k 2014年5月16日 下午6:18:35
 */
public class InvokePandoraExportSerlvet extends HttpServlet {

    private static final long serialVersionUID = -3749534212151928963L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        
        ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        WeiPengService wps = (WeiPengService) applicationContext.getBean("weipengProxy");
        String url = wps.echo(req.getRequestURL().toString());
        resp.getWriter().println(url);
    }
}