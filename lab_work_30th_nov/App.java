package com.jdbcconnectivity.learningmanagementsystem;

import com.jdbcconnectivity.learningmanagementsystem.util.*;
import com.jdbcconnectivity.learningmanagementsystem.controller.*;




public class App 
{
    public static void main( String[] args )
    {
    	
        //to create tables if not exists
    	DatabaseUtil.createTables();
    	
//    	new CourseController().registerCourseUI();
      	new FacultyController().registerFacultyUI();
    }
}
