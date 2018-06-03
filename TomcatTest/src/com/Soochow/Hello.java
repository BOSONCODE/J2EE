package com.Soochow;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    //该函数用初始化该Servlet(有点类似于类的构造函数)
    //该函数只会被调用一次(当用户第一次访问该servlet时被调用)
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init it");
	}

	/**
	 * @see Servlet#destroy()
	 */
	//销毁servlet实例(释放内存)
	//1.reload 该servlet(webapps) 2.关闭tomcat 3.关机
	public void destroy() {
		System.out.println("destroy");
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	//这个函数用于处理业务逻辑
	//程序员应当把业务逻辑代码写在这里
	//当用户每访问该servlet时, 都会被调用
	//request: 用于获得客户端(浏览器)的信息
	//response: 用于向客户端(浏览器)返回信息
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 从response中得到PrintWriter
		System.out.println("service it");
		PrintWriter pw = response.getWriter();
		pw.println("hello world!");
	}

}
