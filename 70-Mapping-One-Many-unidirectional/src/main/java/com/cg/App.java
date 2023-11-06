package com.cg;

import java.util.ArrayList;

import com.cg.entity.Course;
import com.cg.entity.Instructor;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;


public class App {
	public static void main(String args[])
	{
		//--------------    @OneToMany -----------------
/*
		InstructorDAO instructorDao = new InstructorDAO();
		Instructor instructor = new Instructor("Alex", "Martin", "alex@gmail.com");
	    Course course1 = new Course("Learn Angular");
	    Course course2 = new Course("Learn React");
	    CourseDAO courseDAO = new CourseDAO();
	    courseDAO.saveCourse(course1);
	    courseDAO.saveCourse(course2);
	    ArrayList<Course> courseList = new ArrayList<Course>();
	    
	    courseList.add(course1);
	    courseList.add(course2);
	 
	    instructor.getCourses().add(course1);
	    instructor.getCourses().add(course2);
        
        instructorDao.saveInstructor(instructor);
     */
		
	//--------------    @OneToMany(cascade = CascadeType.ALL)--------
		// No need to persist the child object explicitly persisit on parent will automatically propogate to child
	
		InstructorDAO instructorDao = new InstructorDAO();
		Instructor instructor = new Instructor("Alex1", "Martin", "alex@gmail.com");
       
	    Course course1 = new Course("Learn Angular");
	    Course course2 = new Course("Learn React");
        instructorDao.saveInstructor(instructor);
       
	}

}
