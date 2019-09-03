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


@WebServlet("/BalanceController")
public class BalanceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AccountServiceImpl as = new AccountServiceImpl();
	Customer c;
    public BalanceController() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession ses=request.getSession();
		
		c = (Customer) ses.getAttribute("customer");
		String bPressed = request.getParameter("button");
		String money = request.getParameter("money");
		
		if(bPressed.equalsIgnoreCase("deposit"))
		{
			String balance =as.deposit(c.getAccount(),money);
			ses.setAttribute("balance", balance);
			RequestDispatcher dis=request.getRequestDispatcher("balance.jsp");
			dis.forward(request, response);
		}
		else if(bPressed.equalsIgnoreCase("withdraw"))
		{
			
		}
	}

}
