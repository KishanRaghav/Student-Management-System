package com.kishan.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kishan.demo.Entity.Student;
import com.kishan.demo.Service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public String showAllStudents(Model model) {
		model.addAttribute("listStudents", studentService.getAllStudent() );
		return "index";
	}
	
	@GetMapping("/addStudent")
	public String showNewStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "add_student";
	}
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/";
	}

	
	@GetMapping("/updateStudent/{id}")
	public String updateStudent(@PathVariable int id , Model model) {
		model.addAttribute("student", studentService.updateStudent(id));
		return"update_student";
	}
	
	
	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int id ) {
		this.studentService.deletStudent(id);
		return"redirect:/";
	}
}
