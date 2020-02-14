package com.cts.training.fliter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

	public LoginFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String user = request.getParameter("username");
		if (user.equalsIgnoreCase("admin")) {
			System.out.println("Preprocessing the request");
			chain.doFilter(request, response);
			System.out.println("Postprocessing the response");
		}else {
			RequestDispatcher rd=request.getRequestDispatcher("login2.jsp");
			rd.include(request, response); 
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
