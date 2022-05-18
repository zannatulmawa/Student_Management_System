//we are taking StudentRepository Interface here in order to add multiple inheritances

package my.workbench.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
//It's a spring framework type container like HashMap or ArrayList

import my.workbench.StudentManagementSystem.entity.Student;



//JpaRepository<T, ID> so <Type of the jpa entity, type of the primary key>

//usually we need to add @Repository
//but as JpaRepository already has a built in @Repository annotation we don't need to add it again.
//extends is used when a class wants to inherits all the properties from another class

public interface StudentRepository extends JpaRepository<Student, Long>{
	

}
