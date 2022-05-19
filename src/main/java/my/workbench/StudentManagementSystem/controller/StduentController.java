package my.workbench.StudentManagementSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import my.workbench.StudentManagementSystem.entity.Student;
import my.workbench.StudentManagementSystem.service.StudentService;

@Controller //to handle the html url request
public class StduentController {
	
	private StudentService studentService;
	
	//if spring uses one constructor, @addAll anotation is not needed there

	public StduentController(StudentService studentService) { 
		super();
		this.studentService = studentService;
	}
	
	//creating handler method to handle list students and return model and view
	
	@GetMapping("/students") //It will map to the student page
	public String listStudents(Model model) {
		//model is just like HashMap container, it will take two arguments: key and values
		model.addAttribute("students", studentService.getAllStudents()); 
		
		return "students"; //students is the view
		
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		//create student object to hold student form data
		Student student = new Student();
		
						   //key	  //Value
		model.addAttribute("student", student);
		
		return "create_student"; //view
	}
	
	@PostMapping("/students") //? //pst mappin as it is a post request
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}

	

}
