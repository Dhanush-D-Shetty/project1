package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.KssebSignup;

public class Kseeb_dao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et= em.getTransaction();
	
	public void Signup(KssebSignup dto) {
		et.begin();
		em.persist(dto);
		et.commit();
	}

	public KssebSignup sigi(String email) {
		KssebSignup dt =em.find(KssebSignup.class, email);
		return dt;
	}
}
