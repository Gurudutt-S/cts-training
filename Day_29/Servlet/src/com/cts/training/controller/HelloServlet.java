package com.cts.training.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException   {

		PrintWriter out = response.getWriter();
//		out.println("Hello to servlet");

		String username = request.getParameter("user");
		String password = request.getParameter("pass");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");

		out.println("Username: " + username);
		out.println("<br>password: " + password);
		out.println("<br>E-Mail: " + email);
		out.println("<br>Phone: " + phone);

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/cts";
			String usrname = "root";
			String passwrd = "password";

			Connection conn = DriverManager.getConnection(url, usrname, passwrd);
			System.out.println("successful");

			String query = "insert into helloServlet values (?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, email);
			ps.setString(4, phone);

			int result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher rd=request.getRequestDispatcher("login.html");
		rd.forward(request, response);

	}

}
