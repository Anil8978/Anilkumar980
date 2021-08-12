package net.amdocs.registration.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.amdocs.registration.dao.FeedbackDao;
import net.amdocs.registration.model.Feedback;

/**
 * Servlet implementation class FeedbackServlet
 */
@WebServlet("/FeedbackServlet")
public class FeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private FeedbackDao feedbackDao=new FeedbackDao();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeedbackServlet() {
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
		String Name=request.getParameter("Name");
		int user_id = Integer.parseInt(request.getParameter("user_id"));
		String Email= request.getParameter("Email");
		String Feedback= request.getParameter("Feedback");
		
		Feedback feedback=new Feedback();
		feedback.setName(Name);
		feedback.setUser_id(user_id);
		feedback.setEmail(Email);
		feedback.setFeedback(Feedback);
		
		try
		{
		feedbackDao.registerFeedback(feedback);
	}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		

}
}
