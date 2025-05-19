package com.boratoroslu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boratoroslu.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
