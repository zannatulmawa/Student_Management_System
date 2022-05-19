package my.workbench.StudentManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import my.workbench.StudentManagementSystem.entity.Student;
import my.workbench.StudentManagementSystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner { //need to add commandliner interface for running the student record

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	//to run the student record
	@Override
	public void run(String... args) throws Exception {
		
		//ctrl+shift+/ for comment out a block of codes
		
		/*
		 * Student student1 = new Student ("Zannatul", "Mawa", "zannat@udel.edu");
		 * studentRepository.save(student1); //to save the student1 class in the
		 * studentRepository interface
		 * 
		 * Student student2 = new Student("Ishtiaque", "Mahbub", "mahbub@udel.edu");
		 * studentRepository.save(student2);
		 * 
		 * Student student3 = new Student("Ridwone", "Hossain", "ridwone@gmail.com");
		 * studentRepository.save(student3);
		 */
		
		
		
	}

}
