package com.jdbcconnectivity.learningmanagementsystem.dao.impl;
import java.util.ArrayList;
import java.sql.*;
import com.jdbcconnectivity.learningmanagementsystem.dao.CourseDAO;
import com.jdbcconnectivity.learningmanagementsystem.model.Course;
import com.jdbcconnectivity.learningmanagementsystem.util.*;

public class CourseDAOImpl implements CourseDAO
{

	@Override
	public int save(Course courseData) 
	{
		int insertedRows = 0;
		try(Connection con = DatabaseUtil.establishConnection();)
		{
			
			/*--- creating reference of Prepared Statement interface ---*/
			PreparedStatement stmt = con.prepareStatement("insert into course values(?,?,?,?,?,?)");
			/*--- setting values into the query parameters */
			stmt.setString(1, courseData.getCourseId());
			stmt.setString(2, courseData.getCourseName());
			stmt.setString(3, courseData.getDescription());
			stmt.setInt(4, courseData.getDuration());
			stmt.setInt(5, courseData.getMin_enrollment());
			stmt.setInt(6, courseData.getMax_enrollment());
			/*-------------------------------------------------*/
			//executing the query
			insertedRows = stmt.executeUpdate();
		}
		catch(SQLException sqe)
		{
			System.out.println(sqe);
		}
		return insertedRows;
	}

	@Override
	public ArrayList<Course> findAll() {
		//defining an arraylist
				ArrayList<Course> courseList = new ArrayList<>();
				try(Connection con = DatabaseUtil.establishConnection())
				{
					//create statement
					Statement stmt = con.createStatement();
					//query to slect data from table
					String sqlQuery = "Select courseid,"
							+"coursename,description,"
							+"duration,min_enrollment,"
							+"max_enrollment from course";
					//to execute the select query
					ResultSet result = stmt.executeQuery(sqlQuery);
					//Creating object of Course
					Course course;
					//fetching data
					while(result.next())
					{
						course = new Course();
						//setting course data
						course.setCourseId(result.getString(1));
						course.setCourseName(result.getString(2));
						course.setDescription(result.getString(3));
						course.setDuration(result.getInt(4));
						course.setMin_enrollment(result.getInt(5));
						course.setMax_enrollment(result.getInt(6));
						//inserting course into arraylist
						courseList.add(course);
					}				
				}
				catch(SQLException sqe)
				{
					System.out.println(sqe);
				}
				
				return courseList;

	}

	@Override
	public Course findByCourseId(String courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateCourseDurationByCourseId(String courseId, int duration) 
	{
		int updatedRows = 0;
		try(Connection con = DatabaseUtil.establishConnection();)
		{
			
			/*--- creating reference of Prepared Statement interface ---*/
			PreparedStatement stmt = con.prepareStatement("update course set duration = ? where courseid = ?");
			/*--- setting values into the query parameters */
			stmt.setInt(1, duration);
			stmt.setString(2, courseId);
			/*-------------------------------------------------*/
			//executing the query
			updatedRows = stmt.executeUpdate();
		}
		catch(SQLException sqe)
		{
			System.out.println(sqe);
		}
		return updatedRows;
	}
	@Override
	public int delete(String courseId) {

		int deletedRows = 0;
		try(Connection con =DatabaseUtil.establishConnection())
		{
			//to create reference of preparedStatement interface
			PreparedStatement stmt = con.prepareStatement("delete from course where courseid = ? ");
			//setting query parameters
			stmt.setString(1, courseId);
			
			//to exceute the query
			deletedRows = stmt.executeUpdate();
		}
		catch(SQLException sqe)
		{
			System.out.println(sqe);
		}
		// TODO Auto-generated method stub
		return deletedRows;
	}

}

