package gameplay;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAOCharacter;
import model.Character;
import model.User;


@WebServlet("/gameplay/play")
public class Play extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tipologiaPersonaggio = request.getParameter("option");
		User user = (User) request.getSession().getAttribute("user");
		DAOCharacter daoCharacter = new DAOCharacter();
		Character character = new Character("nickname", user, tipologiaPersonaggio);
		if(daoCharacter.saveCharacter(character)) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/gameplay/game.jsp");
	        dispatcher.forward(request, response);
		}
		
	}

}
