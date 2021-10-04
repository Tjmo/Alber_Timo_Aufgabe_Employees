package dao;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpaDAO<E> {
	private static EntityManagerFactory entityManagerFactory;

	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("employees");
	}

	public JpaDAO() {
	}

	public E create(E entity) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		entityManager.persist(entity);
		entityManager.getTransaction().commit();

		entityManager.close();
		return entity;
	}

	public E update(E entity) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(entity);
		entityManager.getTransaction().commit();
		entityManager.close();
		return entity;
	}

	public E find(Class<E> type, Object id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		E entity = entityManager.find(type, id);
		entityManager.close();
		return entity;
	}

	public void delete(Class<E> type, Object id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		E e = find(type, id);
		entityManager.remove(e);

		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void close() {
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
	}
}