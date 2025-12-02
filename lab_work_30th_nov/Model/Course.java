package com.jdbcconnectivity.learningmanagementsystem.model;

public class Course 
{
	//to store course id
	private String courseId;
	//to store course name
	private String courseName;
	//to store description of the course
	private String description;
	//to store duration of the course
	private int duration;
	//to store min enrollment required
	private int min_enrollment;
	//to store max enrollment
	private int max_enrollment;
	/*--------------------------------------------------------*/
	//Default constructor
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*-------------------------------------------------------*/
	public Course(String courseId, String courseName, String description, int duration, int min_enrollment,
			int max_enrollment) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.description = description;
		this.duration = duration;
		this.min_enrollment = min_enrollment;
		this.max_enrollment = max_enrollment;
	}
	/*----------------------------------------------------*/
	/*----- Getter and setter ----------*/
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getMin_enrollment() {
		return min_enrollment;
	}
	public void setMin_enrollment(int min_enrollment) {
		this.min_enrollment = min_enrollment;
	}
	public int getMax_enrollment() {
		return max_enrollment;
	}
	public void setMax_enrollment(int max_enrollment) {
		this.max_enrollment = max_enrollment;
	}	
	/*------------------------------------------------*/
	
	@Override
	public String toString() {
		return "Course Id : " + courseId 
				+ "\nCourse Name : " + courseName 
				+ "\nDescription : " + description
				+ "\nDuration : " + duration 
				+ "\nMin required Enrollment : " + min_enrollment
				+ "\nMax Enrollment : " + max_enrollment
				+ "\n------------------------------------\n";
	}

	

}

