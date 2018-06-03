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
    //�ú����ó�ʼ����Servlet(�е���������Ĺ��캯��)
    //�ú���ֻ�ᱻ����һ��(���û���һ�η��ʸ�servletʱ������)
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init it");
	}

	/**
	 * @see Servlet#destroy()
	 */
	//����servletʵ��(�ͷ��ڴ�)
	//1.reload ��servlet(webapps) 2.�ر�tomcat 3.�ػ�
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
	//����������ڴ���ҵ���߼�
	//����ԱӦ����ҵ���߼�����д������
	//���û�ÿ���ʸ�servletʱ, ���ᱻ����
	//request: ���ڻ�ÿͻ���(�����)����Ϣ
	//response: ������ͻ���(�����)������Ϣ
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// ��response�еõ�PrintWriter
		System.out.println("service it");
		PrintWriter pw = response.getWriter();
		pw.println("hello world!");
	}

}
