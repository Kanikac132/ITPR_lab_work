package com.jdbcconnectivity.learningmanagementsystem.dao;
import  com.jdbcconnectivity.learningmanagementsystem.model.Course;
import java.util.*;

public interface CourseDAO 
{
	/*---- to insert data into the table ----*/
	int save(Course courseData);
	
	/*--- to fetch complete course list ---*/
	ArrayList<Course> findAll();
	
	//method to delete the course
		int delete(String courseId);
	
	/*--- to fetch course details based on course id ----*/
	Course findByCourseId(String courseId);
	
	/*---- to update Course Duration based on course id ---*/
	int updateCourseDurationByCourseId(String courseId, int duration);
	
}
