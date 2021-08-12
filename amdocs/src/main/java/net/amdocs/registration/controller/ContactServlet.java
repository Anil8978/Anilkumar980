package net.amdocs.registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.amdocs.registration.dao.ContactDao;
import net.amdocs.registration.model.Contact;

/**
 * Servlet implementation class ContactServlet
 */
@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ContactDao contactDao = new ContactDao();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactServlet() {
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
		// TODO Auto-generated method stub
		
		int user_id = Integer.parseInt(request.getParameter("user_id"));
		String Name= request.getParameter("Name");
		String Email= request.getParameter("Email");
		int Phone = Integer.parseInt(request.getParameter("Phone"));
		String Message= request.getParameter("Message");
		
		Contact contact= new Contact();
		contact.setUser_id(user_id);
		contact.setName(Name);
		contact.setEmail(Email);
		contact.setPhone(Phone);
		contact.setMessage(Message);
		
		try {
			
		contactDao.registerContact(contact);
		
		}
		
	catch  (ClassNotFoundException b) {
		b.printStackTrace();
			
		}
		//response.sendRedirect("course.jsp");
		RequestDispatcher dispatcher=request.getRequestDispatcher("Course.jsp");
		dispatcher.forward(request, response);
	}

}
