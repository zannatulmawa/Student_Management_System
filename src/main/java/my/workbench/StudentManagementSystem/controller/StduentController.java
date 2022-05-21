package my.workbench.StudentManagementSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@PostMapping("/students") //? //post mapping as it is a post request
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}

	@GetMapping("/students/edit/{id}") //?
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}
	
	@PostMapping("/students/{id}") //?
	public String updateStudent(@PathVariable Long id, 
			@ModelAttribute("student") Student student, Model model) {
		
		// get student from database by id
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		//save updated student object
		studentService.updateStudent(existingStudent);
		return "redirect:/students";	
		
	}
	
	//handler method to handle delete student request
	
			@GetMapping("/students/{id}") //?
			public String deleteStudent(@PathVariable Long id) {
				studentService.deleteStudentById(id);
				 return "redirect:/students";
			}

}
