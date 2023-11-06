package com.cg;

import com.cg.entity.Instructor;
import com.cg.entity.InstructorDetail;
import com.cg.util.JPAUtil;

import jakarta.persistence.EntityManager;

public class InstructorDetailDao {


public void saveInstructor(InstructorDetail instructorDetail) {
		 EntityManager em =JPAUtil.getEntityManagerFactory().createEntityManager(); 
        em.getTransaction().begin( );  
        System.out.println("Instructor:" + instructorDetail);
        em.persist(instructorDetail);
        em.getTransaction().commit(); 
        em.close();             
	 }

public void findEntity(int id) {
   EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
   entityManager.getTransaction().begin();
   InstructorDetail instructorDetail = entityManager.find(InstructorDetail.class, id);
   System.out.println(instructorDetail);
   entityManager.getTransaction().commit();
   entityManager.close();
}

public void updateEntity(InstructorDetail instructorDetail) {
   EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
   entityManager.getTransaction().begin();

   InstructorDetail instructor1 = entityManager.find(InstructorDetail.class, instructorDetail.getId());
   System.out.println("Found:"+ instructorDetail);
   // The entity object is physically updated in the database when the transaction
   // is committed
   instructor1.setId(instructorDetail.getId());
   instructor1.setHobby(instructorDetail.getHobby());
   instructor1.setYoutubeChannel(instructorDetail.getYoutubeChannel());
   
  
  
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



