package com.cg;

import com.cg.entity.Instructor;
import com.cg.entity.InstructorDetail;

public class App {
	public static void main(String args[])
	{

        Instructor instructor = new Instructor("Max", "One", "max@gmail.com");
        InstructorDetail instructorDetail = new InstructorDetail("http://www.youtube.com", "Guitar");
        // Save instructor from ins
        instructorDetail.setInstructor(instructor);
       
        InstructorDetailDao intructorDetailDao = new InstructorDetailDao();
        intructorDetailDao.saveInstructor(instructorDetail);

        
	}

}
