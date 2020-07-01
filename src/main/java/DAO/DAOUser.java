package DAO;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.User;

public class DAOUser {

	private Logger LOG = LoggerFactory.getLogger(DAOUser.class);

	public boolean saveUser(User user) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			session.save(user);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
			
	}

	public User getUserByEmail(String email) {
		User user = new User();
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			user = (User) session.createQuery("From User U where U.email = :email").setParameter("email", email)
					.uniqueResult();
		}
		return user;
	}

	public User validate(String email, String password) {
		User user = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			user = (User) session.createQuery("FROM User U WHERE U.email = :email").setParameter("email", email)
					.uniqueResult();
			if (user != null && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}
}
