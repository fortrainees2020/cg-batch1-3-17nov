package com.cg;

import com.cg.entity.Course;
import com.cg.entity.Instructor;
import com.cg.util.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transaction;

public class CourseDAO {

	 public void saveCourse(Course course) {
		 EntityManager em =JPAUtil.getEntityManagerFactory().createEntityManager();   
         em.getTransaction().begin( );          
         em.persist(course);
        em.getTransaction().commit(); 
         em.close();             
	 }

public void findEntity(int id) {
    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
    entityManager.getTransaction().begin();
    Course course = entityManager.find(Course.class, id);
    
    System.out.println(course);
    entityManager.getTransaction().commit();
    entityManager.close();
}

public void updateEntity(Course course) {
    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
    entityManager.getTransaction().begin();

    Course  course1 = entityManager.find(Course.class, course.getId());
    System.out.println("Found:"+ course1);
    // The entity object is physically updated in the database when the transaction
    // is committed
    course1.setId(course.getId());
    course1.setTitle(course.getTitle());
 
    entityManager.getTransaction().commit();
    entityManager.close();
}

public void removeEntity(int id ) {
    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
    entityManager.getTransaction().begin();
    
    Course  course1 = entityManager.find(Course.class, id);
    System.out.println();
    entityManager.remove(course1);
    entityManager.getTransaction().commit();
    entityManager.close();
}


}
