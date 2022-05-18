package my.workbench.StudentManagementSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//In order to make it a jpa entity

@Table(name = "students")
//maping the entity to database table using table annotation

public class Student {
	
	@Id
	//In order to add the primary keys at the table we are using id annotation
	
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	//Instruct database to generate a value
	//generationtype.identity is used for assigning primary keys for the entity using a database identity column
	private Long id;
	
	@Column(name = "first_name", nullable = false )
	//for mapping the column for the below fields
	//adding column attributes for the values
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	//default constructor
	public Student() {
		
	}
	
	
	//parameterized constructor
	public Student(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	
	//Initializing getter setter
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
