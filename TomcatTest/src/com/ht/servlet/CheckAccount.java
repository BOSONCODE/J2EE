package com.ht.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CheckAccount
 */
@WebServlet("/CheckAccount")
public class CheckAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		AccountBean account = new AccountBean();
		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		account.setPassword(pwd);
		account.setUsername(username);
		if ((username != null) && (username.trim().equals("jsp"))) {
			if((pwd != null) && (pwd.trim().equals("1"))){
				System.out.print("success");
				session.setAttribute("account", account);
				String login_suc = "success.jsp";
				response.sendRedirect(login_suc);
				return;
			}
		}
		String login_fail = "fail.jsp";
		response.sendRedirect(login_fail);
		return ;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
