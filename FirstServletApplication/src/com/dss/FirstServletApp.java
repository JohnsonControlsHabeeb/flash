package com.dss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServletApp implements Servlet {

	public FirstServletApp() {

	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()");

	}

	public void destroy() {

		System.out.println("destroy()");

	}

	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig()");

		return null;
	}

	public String getServletInfo() {
		System.out.println("getServletInfo()");

		return null;
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("service()");
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();

		printWriter.println("this is my first application");
	}

}
