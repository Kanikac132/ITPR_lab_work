package com.jdbcconnectivity.learningmanagementsystem.service.impl;
import com.jdbcconnectivity.learningmanagementsystem.dao.*;
import com.jdbcconnectivity.learningmanagementsystem.dao.impl.*;
import com.jdbcconnectivity.learningmanagementsystem.model.*;
import com.jdbcconnectivity.learningmanagementsystem.service.*;
import java.util.*;

public class FacultyServiceImpl implements FacultyService{
	
private FacultyDAO facultyDAO;
	
	//constructor 

	public FacultyServiceImpl() {
		//to intialize DAO reference
		facultyDAO = new FacultyDAOImpl();
	}
	
	@Override
	public void registerFaculty(Faculty faculty) 
	{
		if(faculty == null) //verifying faculty object null
		{
			System.out.println("Faculty data is empty");
		}
		
		else
		{
			//calling save method()of dao to insert the faculty data into the table
			int rows = facultyDAO.save(faculty);
			if(rows > 0) // number of rows greater than 0 indicates successful insert operation
			{
				System.out.println("faculty Successfully Registered");
			}
			else
			{
				System.out.println("Unable to register the faculty");
			}
		}
		
	}



	@Override
	public void getFacultyList() {
		// To fetch records from DAO layer
		ArrayList<Faculty> facultyList = facultyDAO.findAll();
		if(facultyList.size() > 0)
		{
			System.out.println(facultyList);
		}
		else
		{
			System.out.println("No faculty data found");
		}
	}

	@Override
	public void getFacultyDetails(String facultyId) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void updateFacultyStatus(String facultyId, String status) {
		// TODO Auto-generated method stub
		
	}

}
