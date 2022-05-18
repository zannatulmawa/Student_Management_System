package my.workbench.StudentManagementSystem.controller;

import org.springframework.stereotype.Controller;

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
	
	

	

}
