package net.amdocs.registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.amdocs.registration.dao.AdminDao;
import net.amdocs.registration.model.Admin;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AdminDao adminDao=new AdminDao();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int Admin_id = Integer.parseInt(request.getParameter("Admin_id"));
		String Password= request.getParameter("Password");
		String Name= request.getParameter("Name");
		String Eamil= request.getParameter("Email");
		
		Admin admin =new Admin();
		admin.setAdmin_id(Admin_id);
		admin.setPassword(Password);
		admin.setName(Name);
		admin.setEmail(Eamil);
		
		try {
		adminDao.registerAdmin(admin);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Adminsuccess.jsp");
		dispatcher.forward(request, response);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		}
		
		
	}

