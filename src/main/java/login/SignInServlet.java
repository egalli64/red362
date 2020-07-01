package login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import DAO.DAOUser;
import model.User;
import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher;


@WebServlet("/login/signIn")
public class SignInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final Logger LOG = LoggerFactory.getLogger(SignInServlet.class);
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("signIn.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOUser dao = new DAOUser();
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String repeatedPassword = request.getParameter("repeatedPassword");
		if(password.length() < 8) {
			LOG.debug("Password corta");
		}
		if(!password.equals(repeatedPassword)) {
			LOG.debug("Password diverse");
		}
		User user = dao.getUserByEmail(email);
		if(user == null) {
			user = new User(username,password,email);
			dao.saveUser(user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			request.setAttribute("userRegistered", "Utente registrato correttamente. Fai il Login");
            dispatcher.forward(request, response);
		} else {
			response.sendRedirect("invalidLogin.jsp");;
		}
	}

}
