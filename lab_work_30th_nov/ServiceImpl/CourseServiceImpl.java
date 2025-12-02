package com.jdbcconnectivity.learningmanagementsystem.service.impl;
import com.jdbcconnectivity.learningmanagementsystem.service.*;
import com.jdbcconnectivity.learningmanagementsystem.model.*;
import com.jdbcconnectivity.learningmanagementsystem.dao.*;
import com.jdbcconnectivity.learningmanagementsystem.dao.impl.*;
import java.util.ArrayList;

public class CourseServiceImpl implements CourseService{

	
private CourseDAO courseDAO;
	
	//constructor 

	public CourseServiceImpl() {
		//to intialize DAO reference
		courseDAO = new CourseDAOImpl();
	}
	
	@Override
	public void registerCourse(Course course) 
	{
		if(course == null) //verifying course object null
		{
			System.out.println("Course data is empty");
		}
		else if(course.getDuration() < 50)
		{
			System.out.println("Course with less than 50 hours are not allowed");
		}
		else if(course.getMin_enrollment() < 20)
		{
			System.out.println("Courses are not allowed with less than 20 students");
		}
		else if(course.getMax_enrollment() > 70)
		{
			System.out.println("Course size cannot exceed for more than 70 students");
		}
		else
		{
			//calling save method()of dao to insert the course data into the table
			int rows = courseDAO.save(course);
			if(rows > 0) // number of rows greater than 0 indicates successful insert operation
			{
				System.out.println("Course Successfully Registered");
			}
			else
			{
				System.out.println("Unable to register the course");
			}
		}
		
	}


	@Override
	public void updateCourseDuration(String courseId, int duration) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCourseList() {
		// To fetch records from DAO layer
		ArrayList<Course> courseList = courseDAO.findAll();
		if(courseList.size() > 0)
		{
			System.out.println(courseList);
		}
		else
		{
			System.out.println("No course data found");
		}
	}

	@Override
	public void getCourseDetails(String courseId) {
		// TODO Auto-generated method stub
		
	}

	

}
