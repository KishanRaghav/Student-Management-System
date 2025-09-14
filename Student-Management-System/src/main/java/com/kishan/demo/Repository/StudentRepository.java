package com.kishan.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kishan.demo.Entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
