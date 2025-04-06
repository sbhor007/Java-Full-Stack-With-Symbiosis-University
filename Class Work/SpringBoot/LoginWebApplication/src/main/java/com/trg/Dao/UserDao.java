package com.trg.Dao;

import com.trg.Model.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class UserDao {
	static EntityManagerFactory entityManagerFactory;
	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
	}
	
	static public User searchUser(User user) {
		try {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
			Query query = entityManager.createQuery("SELECT u From User u WHERE u.username = :username AND u.password = :password");
			query.setParameter("username", user.getUsername());
			query.setParameter("password", user.getPassword());
			User u = (User) query.getSingleResult();
			System.out.println("1: " + u );
//			System.out.println(user);
//			User u = entityManager.find(User.class, user.getUsername());
//			entityManager.getTransaction().commit();
			return u;
		} catch (Exception e) {
			System.err.println("Search User : " + e);
			return null;
		}
//		return null;
	}
}
