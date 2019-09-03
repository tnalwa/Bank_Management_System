package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Account;
import com.bean.Customer;
import com.service.AccountServiceImpl;
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AccountServiceImpl as = new AccountServiceImpl();
	Customer c = new Customer();
    public LoginController() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password= request.getParameter("password");
		Customer cus = as.LoginCheck(username, password);
		if(cus!=null)
		{
			HttpSession ses=request.getSession();
			
			ses.setAttribute("customer", cus);
				
			RequestDispatcher dis=request.getRequestDispatcher("Profile.jsp");
			dis.forward(request, response);
		}
		else
		{
			System.out.println("No user found");
		}
		
		
		
	}

}
