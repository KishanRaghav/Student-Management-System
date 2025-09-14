package com.kishan.demo.Service;

import java.util.List;

import com.kishan.demo.Entity.Student;
public interface StudentService {
	List<Student>getAllStudent();
	 void saveStudent(Student student);
	 Student updateStudent(int id);
	 void deletStudent(int id);

}
