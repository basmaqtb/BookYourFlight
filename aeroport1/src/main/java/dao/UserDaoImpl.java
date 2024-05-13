package dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import metier.User;

public class UserDaoImpl implements UserDao {

	@Override
	public User getUserById(Integer id_user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		User user = session.get(User.class, id_user);
		session.close();
		return user;
	}
	

	@Override
	public void addUser(User user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public void updateUser(User user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(user);
		session.getTransaction().commit();
		session.close();
		return ;
	}

	@Override
	public void deleteUser(Integer id_user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		User user = session.get(User.class, id_user);
		session.delete(user);
		session.getTransaction().commit();
		session.close();
	}

	
	@Override
	public List<User> getAllUsers() throws SQLException {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<User> allUsers = session.createQuery("FROM User", User.class).getResultList();
		session.close();
		return allUsers;
	}

}
