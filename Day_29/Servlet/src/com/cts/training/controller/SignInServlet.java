package com.cts.training.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class SignInServlet extends HttpServlet {

	public boolean isValid(String uname, String pass) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/cts";
		String usrname = "root";
		String passwrd = "password";

		Connection conn = DriverManager.getConnection(url, usrname, passwrd);
		System.out.println("successful");
		String query = "select * from helloServlet where username=?  and password=?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, uname);
		ps.setString(2, pass);

		ResultSet result = ps.executeQuery();

		if (result.next()) {
			return true;
		} else {
			return false;
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) {

		String uname = request.getParameter("uname");
		String pass = request.getParameter("passwd");

		RequestDispatcher rd;

		try {
			if (isValid(uname, pass)) {
				rd = request.getRequestDispatcher("welcome.html");
				rd.forward(request, response);

			} else {
				rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
