package com.boratoroslu.services;import java.util.List;

import com.boratoroslu.entities.Student;

public interface IStudentService {

	public Student saveStudent(Student student);
	
	public List<Student> getAllStudents();
	
	public Student getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
	
	public Student updateStudent(Integer id , Student uptadeStudent);
 }
