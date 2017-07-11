package main.java;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dbdetails.ConnectionDetails;

public class UserLoginController extends HttpServlet {
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
					
		
		ConnectionDetails con = new ConnectionDetails();
		Connection c=   con.getConnection();
		
		String dbpwd = null;
		if(null!= c)
		{
			try {
				java.sql.PreparedStatement st =c.prepareStatement("select * from login where username = ? ");
				st.setString(1, uname);
				ResultSet rs = st.executeQuery();
				if (rs.next()) {
					 dbpwd = rs.getString(3);
				}
				
				if(pass.toString().equals(dbpwd.toString()))
				{
					System.out.println("password matached");
					response.sendRedirect("UserLoginSuccess.jsp");
				}
				else
				{
					response.sendRedirect("UserLoginView.jsp");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		}		
	
	}
			
	

}
