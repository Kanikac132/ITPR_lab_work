package com.jdbcconnectivity.learningmanagementsystem.model;


public class Faculty 
{
	//to store faculty id
	private String facultyId;
	//to store name of the faculty
	private String facultyName;
	//to store qualification of the faculty
	private String qualification;
	//to store status of the faculty
	private String status;
	/*---------------------------------------*/
	/*--------- Default constructor -------*/
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*-----------------------------------------------------*/
	//----- parameterised constructor ------
	public Faculty(String facultyId, String facultyName, String qualification, String status) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.qualification = qualification;
		this.status = status;
	}
	/*--------------------------------------------------------------------*/
	/*----- Getter and setters --------*/
	public String getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	/*---------------------------------------------------*/
	@Override
	public String toString() {
		return "Faculty Id : " + facultyId 
				+ "\n Faculty Name : " + facultyName 
				+ "\n Qualification : " + qualification
				+ "\n status=" + status 
				+ "\n---------------------------------\n";
	}
}

