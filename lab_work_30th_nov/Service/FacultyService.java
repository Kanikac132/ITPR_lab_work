package com.jdbcconnectivity.learningmanagementsystem.service;
import com.jdbcconnectivity.learningmanagementsystem.model.*;

public interface FacultyService {
	//method to register new faculty
	void registerFaculty(Faculty faculty);
	//method to update faculty status
	void updateFacultyStatus(String facultyId,String status);
	//method to fetch all faculty
	void getFacultyList();
	//method to fetch faculty details of a particular faculty
	void getFacultyDetails(String facultyId);
	//
}
