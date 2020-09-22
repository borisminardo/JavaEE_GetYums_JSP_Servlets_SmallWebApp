package com.boris;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username =request.getParameter("username");
		String password =request.getParameter("password");
		
		if(username.equals("boris") && password.equals("minardo")) {
			HttpSession session = request.getSession();
			session.setAttribute("yums", 20);
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			response.sendRedirect("welcome.jsp");
		}
		else
			response.sendRedirect("login.jsp");
	}

	

}
