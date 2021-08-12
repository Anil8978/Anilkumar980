package net.amdocs.registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.amdocs.registration.dao.userDao;
import net.amdocs.registration.model.user;
/**
 * Servlet implementation class userServlet
 */
@WebServlet("/register")
public class userServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	private userDao usDao= new userDao();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
//    public userServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/userreg.jsp");
//		dispatcher.forward(request, response);
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name= request.getParameter("name");
		int id = Integer.parseInt(request.getParameter("id"));
		String address= request.getParameter("address");
		String password= request.getParameter("password");
		String email= request.getParameter("email");
		int phone_no = Integer.parseInt(request.getParameter("phone_no"));
		int reg_date = Integer.parseInt(request.getParameter("reg_date"));
		
		
		user us=new user();
		us.setName(name);
		us.setId(id);
		us.setAddress(address);
		us.setPassword(password);
		us.setEmail(email);
		us.setPhone_no(phone_no);
		us.setReg_date(reg_date);
		
		try
		{
		usDao.registerStudent(us);
		
	}
		catch(ClassNotFoundException a)
		{
			a.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("successandcontinue.jsp");
		dispatcher.forward(request, response);
}
}
