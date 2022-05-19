package my.workbench.StudentManagementSystem.service;

import java.util.List;

import my.workbench.StudentManagementSystem.entity.Student;

public interface StudentService {
	//calling the getAllStudents class over here
	
	List<Student> getAllStudents(); 

	//class	  //object
	Student saveStudent(Student student);
}
