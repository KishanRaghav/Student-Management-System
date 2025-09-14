package com.kishan.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kishan.demo.Entity.Student;
import com.kishan.demo.Repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public List<Student> getAllStudent() {
		
		return studentRepository.findAll();
	}
	@Override
	public void saveStudent(Student student) {
		studentRepository.save(student);
		
	}
	@Override
	public Student updateStudent(int id) {
		Optional<Student>optional = studentRepository.findById(id);
		Student student = null;
		student=optional.get();
		return student;
	}
	@Override
	public void deletStudent(int id) {
		this.studentRepository.deleteById(id);
		
		
	}

}
