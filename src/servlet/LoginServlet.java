package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.StudentDAO;
import dto.Login;

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
		HttpSession s = request.getSession(true);
		s.removeAttribute("id");
		String view = "/WEB-INF/view/loginView.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String view = null;
		HttpSession s = request.getSession();
		Login result = null;

		try{
			int id = Integer.parseInt(request.getParameter("id"));
			String password = request.getParameter("password");
			if(id > 1000000){
				result=StudentDAO.loginDAO(id, password);
				if(result!=null){
					view = "/WEB-INF/view/menu.jsp";
				}else{
					view = "/WEB-INF/view/loginView.jsp";
					s.setAttribute("login","muri");
				}
			}
			int id1 = result.getId();
			String pass1 = result.getPassword();
			s.setAttribute("id", id1);
			s.setAttribute("pass", pass1);
		}catch(NumberFormatException e){
			e.printStackTrace();
			System.out.println(e);
			view = "/WEB-INF/view/loginView.jsp";
			s.setAttribute("login","Num");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e);
			view = "/WEB-INF/view/loginView.jsp";
			s.setAttribute("login","nai");
		}finally{
			RequestDispatcher d = request.getRequestDispatcher(view);
			d.forward(request, response);
		}
	}

}
