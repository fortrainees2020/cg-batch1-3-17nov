package com.cg;

import java.util.Iterator;
import java.util.List;

import com.cg.entity.Course;
import com.cg.entity.Instructor;
import com.cg.util.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.transaction.Transaction;

public class InstructorDAO {

	 public void saveInstructor(Instructor instructor) {
		 EntityManager em =JPAUtil.getEntityManagerFactory().createEntityManager(); 
         em.getTransaction().begin( );  
         System.out.println("Instructor:" + instructor);
        
         em.persist(instructor);
         em.getTransaction().commit(); 
         em.close();             
	 }

public void findEntity(int id) {
    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
    entityManager.getTransaction().begin();
    Instructor instructor = entityManager.find(Instructor.class, id);
    System.out.println(instructor);
    entityManager.getTransaction().commit();
    entityManager.close();
}

public void updateEntity(Instructor instructor) {
    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
    entityManager.getTransaction().begin();

    Instructor instructor1 = entityManager.find(Instructor.class, instructor.getId());
    System.out.println("Found:"+ instructor);
    // The entity object is physically updated in the database when the transaction
    // is committed
    instructor1.setFirstName(instructor.getFirstName());
    instructor1.setLastName(instructor.getLastName());
    instructor1.setEmail(instructor.getEmail());
   
    entityManager.getTransaction().commit();
    entityManager.close();
}

public void removeEntity(int id ) {
    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
    entityManager.getTransaction().begin();
    
    Instructor instructor = entityManager.find(Instructor.class, id);
    System.out.println();
    entityManager.remove(instructor);
    entityManager.getTransaction().commit();
    entityManager.close();
}


}
