package org.example.ifaces;

import java.util.Optional;

import org.example.model.Student;

public interface TaskRepository {
	
	public Optional<Student> findById(int rollNumber);

	public Student add(Student entity);
	
	
	
	

}
