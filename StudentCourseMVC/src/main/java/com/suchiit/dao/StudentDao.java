package com.suchiit.dao;

import java.util.List;

import com.suchiit.model.Student;
import com.suchiit.model.StudentCourse;

public interface StudentDao {
boolean registerStudent(Student st);
List<Student> viewStudents();
Student viewStudent(int sid);
List<StudentCourse> viewStudentCourse();
}
