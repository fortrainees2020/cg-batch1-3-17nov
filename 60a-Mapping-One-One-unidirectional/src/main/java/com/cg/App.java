package com.cg;

import com.cg.entity.Instructor;
import com.cg.entity.InstructorDetail;

public class App {
	public static void main(String args[])
	{

        Instructor instructor = new Instructor("Alex", "One", "alex@gmail.com");
        InstructorDetail instructorDetail = new InstructorDetail("http://www.youtube.com", "Guitar");
        instructor.setInstructorDetail(instructorDetail);

        InstructorDAO instructorDao = new InstructorDAO();
        instructorDao.saveInstructor(instructor);
	}

}
