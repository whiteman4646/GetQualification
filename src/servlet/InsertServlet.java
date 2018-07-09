package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDAO;
import dto.Student;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
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
		request.setCharacterEncoding("UTF-8");

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("naeme");
		String namektkn = request.getParameter("namektkn");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String department = request.getParameter("department");
		String course = request.getParameter("course");

		Student result = StudentDAO.insertDAO(id, name, namektkn, password,
				gender, email, department, course);
		request.setAttribute("insert", result);

		String view = "/WEB-INF/view/resultInsert.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);

	}

}
