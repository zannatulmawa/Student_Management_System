package my.workbench.StudentManagementSystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import my.workbench.StudentManagementSystem.entity.Student;
import my.workbench.StudentManagementSystem.repository.StudentRepository;
import my.workbench.StudentManagementSystem.service.StudentService;

//impl means implementation
//implements is used to inherit an interface

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository; //This is a class object

	public StudentServiceImpl(StudentRepository studentRepository) { //Initiating parameterized argument getter
		super();
		this.studentRepository = studentRepository;
	}

	@Override //?
	public List<Student> getAllStudents() { //creating a list type method
		return studentRepository.findAll(); //findall method returns a list of method
	}

	@Override //?
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) { //?
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) { //?
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override //?
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}


}
