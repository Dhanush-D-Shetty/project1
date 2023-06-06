package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Marks_Card;

public class Marks_dao {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et= em.getTransaction();
	
	public String insert(Marks_Card  mc) {
		et.begin();
		em.persist(mc);
		et.commit();
		return "data inserted successfully";
	}
	
	public  Marks_Card  fetchByig(long reg_num) {
		Marks_Card markscard=em.find( Marks_Card.class, reg_num);
	
	   return markscard;
	}

}
