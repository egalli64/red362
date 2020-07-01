package DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import model.Character;

public class DAOCharacter {

	private Logger LOG = LoggerFactory.getLogger(DAOUser.class);

	public boolean saveCharacter(Character character) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			LOG.info("Opened Session");
			session.save(character);
			LOG.info("Character is saved");
			return true;
		}catch (Exception e) {
			LOG.warn("Errore nel save Characther");
			e.printStackTrace();
			return false;
		}
			
	}
	
}
