package login;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.DAOCharacter;
import DAO.DAOGame;
import DAO.DAOUser;
import model.Character;
import model.User;

@WebServlet("/login/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private DAOUser loginDao = new DAOUser();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.sendRedirect("login.jsp");
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
        User user = loginDao.validate(email, password);
        if (user != null) {
        	HttpSession session = request.getSession();
        	session.setAttribute("user", user);
            DAOCharacter daoCharacter = new DAOCharacter();
            List<Character> characters = daoCharacter.getCharacterByUser(user);
            RequestDispatcher dispatcher = request.getRequestDispatcher("userLogged.jsp");
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("invalidLogin.jsp");
        }
    }

}
