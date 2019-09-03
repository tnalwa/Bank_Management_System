package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

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

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	AccountServiceImpl as = new AccountServiceImpl();
	Customer c1 = new Customer();
	Account ac = new Account();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String phoneno = request.getParameter("phoneno");
		String type = request.getParameter("type");
		String bname = request.getParameter("bname");
		
		ac = as.createAcccount(name, username, password, address, phoneno, email, type, bname);
				
		RequestDispatcher dis=request.getRequestDispatcher("login.jsp");
		dis.forward(request, response);
		
			//out.println("Problem occured while creating your Account.");
		
		
		
		
	}

}
