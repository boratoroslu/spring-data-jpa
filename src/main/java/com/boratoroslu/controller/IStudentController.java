package com.boratoroslu.controller;

import java.util.List;


import com.boratoroslu.dto.DtoStudent;
import com.boratoroslu.dto.DtoStudentIU;
import com.boratoroslu.entities.Student;

public interface IStudentController {
	
	public DtoStudent saveStudent(DtoStudentIU studentIU);
	 
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
	
	public DtoStudent updateStudent(Integer idInteger , DtoStudentIU dtoStudentIU);

	
}
