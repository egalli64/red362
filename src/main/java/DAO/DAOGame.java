package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import model.Game;

public class DAOGame {
	
	private Logger LOG = LoggerFactory.getLogger(DAOUser.class);

	public boolean saveGame(Game game) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			LOG.info("Opened Session");
			transaction = session.getTransaction();
			transaction.begin();
			session.saveOrUpdate(game);
			LOG.info("Game is saved");
			session.flush();
			transaction.commit();
			return true;
		}catch (Exception e) {
			LOG.warn("Errore nel save Game");
			e.printStackTrace();
			transaction.rollback();
			return false;
		} 
	}
	
	
	public List<Game> getGamesByCharacther(String nickname) {
		List<Game> games = new ArrayList<Game>();
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			games = session.createQuery("From Game G where G.nickname = :nickname").setParameter("nickname", nickname).list();
		}
		return games;
	}
	
	public List<Game> getAll() {
		List<Game> games = new ArrayList<Game>();
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			games = session.createQuery("SELECT a FROM Game a", Game.class).getResultList();
		}
		return games;
	}
	
}
