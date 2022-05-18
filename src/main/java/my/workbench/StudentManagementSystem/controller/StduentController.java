package my.workbench.StudentManagementSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import my.workbench.StudentManagementSystem.service.StudentService;

@Controller //to handle the html url request
public class StduentController {
	
	private StudentService studentService;
	
	//if spring uses one constructor, @addAll anotation is not needed there

	public StduentController(StudentService studentService) { 
		super();
		this.studentService = studentService;
	}
	
	//creating handler method to handle list students and return mode and view
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		//model is just like HashMap container, it will take two arguments: key and values
		model.addAttribute("students", studentService.getAllStudents()); 
		
		return "students"; //students is the view
		
	}

	

}
