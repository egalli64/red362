package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import model.Character;
import model.Game;
import model.User;

public class DAOCharacter {

	private Logger LOG = LoggerFactory.getLogger(DAOUser.class);

	public boolean saveCharacter(Character character) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			LOG.info("Opened Session");
			transaction = session.getTransaction();
			transaction.begin();
			session.saveOrUpdate(character);
			LOG.info("Character is saved");
			session.flush();
			transaction.commit();
			return true;
		}catch (Exception e) {
			LOG.warn("Errore nel save Characther");
			e.printStackTrace();
			transaction.rollback();
			return false;
		} 
	}
	
	public List<Character> getCharacterByUser(User id) {
		List<Character> characters = new ArrayList<Character>();
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			characters = (List<Character>) session.createQuery("From Character C where C.user = :id").setParameter("id", id)
					.list();
		}
		return characters;
	}

	
}
