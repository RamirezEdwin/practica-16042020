package com.edwinisaacclass1604.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.edwinisaacclass1604.model.TbVenta;

public class ventaDao {
	
	public void agregarDatos(TbVenta tbV){
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("class16042020");
		em = emf.createEntityManager();
	    em.getTransaction().begin();
	    em.persist(tbV);
	    em.flush();
	    em.getTransaction().commit();
	}

}
