package com.boratoroslu.services;import java.util.List;

import com.boratoroslu.dto.DtoStudentIU;
import com.boratoroslu.dto.DtoStudent;
import com.boratoroslu.dto.DtoStudentIU;
import com.boratoroslu.entities.Student;

public interface IStudentService {

	public DtoStudent saveStudent(DtoStudentIU student);
	
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
	
	public DtoStudent updateStudent(Integer id , DtoStudentIU dtoStudentIU);
 }
