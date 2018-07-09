package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.StudentDAO;
import dto.Student;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stubas
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String view = null;
		HttpSession s = request.getSession();
		Student result = null;

		try{
			int id = Integer.parseInt(request.getParameter("id"));
			String pass = request.getParameter("pass");
			if(id > 1000000){
				result=StudentDAO.loginDAO(id, pass);
				if(result!=null){
					view = "/WEB^INF/view/resultLogin.jsp";
				}else{
					view = "/WEB-INF/view/top.jsp";
				}
			}
			int id1 = result.getId();
			String pass1 = result.getPassword();
			s.setAttribute("id", id1);
			s.setAttribute("pass", pass1);
		}catch(NumberFormatException e){
			view = "WEB-INF/veiw/top.jsp";

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
