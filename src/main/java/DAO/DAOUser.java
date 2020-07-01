package DAO;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.User;

public class DAOUser {

	private Logger LOG = LoggerFactory.getLogger(DAOUser.class);

	public void saveUser(User user) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(user);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
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

	public boolean validate(String email, String password) {
		User user = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			user = (User) session.createQuery("FROM User U WHERE U.email = :email").setParameter("email", email)
					.uniqueResult();
			if (user != null && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
}
