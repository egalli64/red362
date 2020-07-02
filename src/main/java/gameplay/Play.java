package gameplay;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import DAO.DAOCharacter;
import DAO.DAOGame;
import DAO.DAOUser;
import model.Character;
import model.Game;
import model.User;


@WebServlet("/gameplay/play")
public class Play extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Logger LOG = LoggerFactory.getLogger(Play.class);
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tipologiaPersonaggio = request.getParameter("option");
		String nickname = request.getParameter("nickname");
		DAOUser daoUser = new DAOUser();
		DAOCharacter daoCharacter = new DAOCharacter();
		User user = (User) request.getSession().getAttribute("user");
		LOG.info(user.toString());
		Character character = new Character(nickname, user, tipologiaPersonaggio);
		Game game = new Game();
		game.setCharacter(character);
		game.setLevel(0);
		game.setLastConnection(new Date());
		List<Game> games = new ArrayList<Game>();
		games.add(game);
		character.setGames(games);
		
		if(daoCharacter.saveCharacter(character)) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/gameplay/game.jsp");
	        dispatcher.forward(request, response);
		} else {
			response.sendRedirect("/login/userLogged.jsp");
		}
		
	}

}
