package com.uttara.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
//    public ControllerServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("inside doGet");
		process(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("inside doPost");
		process(request,response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		// this is front controller
		System.out.println("inside Process");
		String uri = request.getRequestURI();
		System.out.println("uri is "+uri);
		
		//based on uri, apply controlling logic
		
		Model model = new Model();
		RequestDispatcher rd = null;
		if(uri.contains("/openRegisterView.do")) {
			rd = request.getRequestDispatcher("Register.jsp");
			rd.forward(request, response);
		}
		if(uri.contains("/openLoginView.do")) {
			rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
		if(uri.contains("/register.do")) {
			
			//get the bean from request scope
			//invoke model-register(bean)
			//accept whether register succeeds/fails
			//if it succeed,forward to Success.Jsp
			//else forward to Register.jsp
			
			System.out.println("in controller servlet process() mehod->register ");
			RegBean bean = (RegBean)request.getAttribute("reg");
			System.out.println("bean is "+bean);
			
			String result = model.register(bean);
			if(result.equals("SUCCESS")) {
				//registration succeeded
				//forward to Success.jsp
				request.setAttribute("message", "Your Registration succeeded");
				rd=request.getRequestDispatcher("Success.jsp");
				rd.forward(request, response);
			}
			else {
				//registration failed
				//forward to Register.jsp
				request.setAttribute("errorMsg", result);
				rd=request.getRequestDispatcher("Register.jsp");
				rd.forward(request, response);
			}
			
		}
		
	}

}
