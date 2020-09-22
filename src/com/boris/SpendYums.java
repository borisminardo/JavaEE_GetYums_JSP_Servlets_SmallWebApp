package com.boris;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/spendyums")
public class SpendYums extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		 int yums = (int) session.getAttribute("yums");
		 session.getAttribute("username");

		 if(yums>=1) {
				session.setAttribute("yums", --yums);
				 if(yums==0)
					 session.setAttribute("noyums", "hai finito gli yums :(");	
		 }
		 response.sendRedirect("personal.jsp");	 
	}
}
