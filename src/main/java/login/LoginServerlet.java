package login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.DAOUser;
import model.User;

@WebServlet("/login/LoginServerlet")
public class LoginServerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private DAOUser loginDao = new DAOUser();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.sendRedirect("login.html");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            authenticate(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void authenticate(HttpServletRequest request, HttpServletResponse response)
    throws Exception {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (loginDao.validate(email, password)) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("userLogged.jsp");
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("invalidLogin.jsp");
        }
    }

}
