package io.nms;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserRepo {
	
	
	private EntityManager em;
	
	public UserRepo() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("User");
		em = emf.createEntityManager();
		
	}
	
	public void createUser(User u) {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
	}
	
	public User getUserById(int id) {
		return em.find(User.class, id);
	}
	
	public void deleteUser(User u) {
		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();
	}
	

}
