package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.QualitbDAO;
import dto.Qualitb;

/**
 * Servlet implementation class QualiInsertServlet
 */
@WebServlet("/QualiInsertServlet")
public class QualiInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public QualiInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view = "/WEB-INF/view/qualiinsert.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession s = request.getSession(true);

		int id = Integer.parseInt(request.getParameter("id"));
		String qname = request.getParameter("sname");
		int sid = (int)s.getAttribute("id");
		String date = request.getParameter("date");
		String result = request.getParameter("result");

		Qualitb  Qresult = QualitbDAO.qualiinsertDAO(id, qname, sid,  date, result);
		request.setAttribute("qualiinsert", Qresult);

		String view = "/WEB-INF/view/resultquali.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);

	}

}
