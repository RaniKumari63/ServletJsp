package com.suchiit.dao;

import java.util.List;

import com.suchiit.model.Course;

public interface CourseDao {

	boolean registerCourse(Course cr);
	List<Course> viewCourses();
	Course viewCourse(int cid);
	
}
