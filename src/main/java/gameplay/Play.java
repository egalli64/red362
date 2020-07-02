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

import DAO.DAOCharacter;
import DAO.DAOGame;
import DAO.DAOUser;
import model.Character;
import model.Game;
import model.User;


@WebServlet("/gameplay/play")
public class Play extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tipologiaPersonaggio = request.getParameter("option");
		User user = (User) request.getSession().getAttribute("user");
		Character character = new Character("nickname", user, tipologiaPersonaggio);
		DAOUser daoUser = new DAOUser();
		Game game = new Game();
		game.setCharacter(character);
		game.setLevel(0);
		game.setLastConnection(new Date());
		List<Game> games = new ArrayList<Game>();
		games.add(game);
		character.setGames(games);
		if(daoUser.saveUser(user)) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/gameplay/game.jsp");
	        dispatcher.forward(request, response);
		}
		
	}

}
