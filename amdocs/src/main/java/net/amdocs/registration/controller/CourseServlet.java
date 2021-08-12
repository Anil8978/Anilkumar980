package net.amdocs.registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.amdocs.registration.dao.CourseDao;
import net.amdocs.registration.model.Course;

/**
 * Servlet implementation class CourseServlet
 */
@WebServlet("/CourseServlet")
public class CourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	private CourseDao courseDao= new CourseDao();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseServlet() {
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
		
		int course_id = Integer.parseInt(request.getParameter("course_id"));
		String Name= request.getParameter("Name");
		String Description= request.getParameter("Description");
		String Resource= request.getParameter("Resource");
		int Fees = Integer.parseInt(request.getParameter("Fees"));
		
		Course course=new Course();
		course.setCourse_id(course_id);
		course.setName(Name);
		course.setDescription(Description);
		course.setResource(Resource);
		course.setFees(Fees);
		
		try {
			
		courseDao.registerCourse(course);
		}
		catch(ClassNotFoundException c)
		{
		c.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("Feedback.jsp");
		dispatcher.forward(request, response);
		
	}

}
