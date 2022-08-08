package org.example.services;

import org.example.ifaces.TaskRepository;
import org.example.model.Student;

public class TaskService {
	
	private TaskRepository repo;

	public TaskService(TaskRepository repo) {
		super();
		this.repo = repo;
	}

	public Student add(Student entity) {
		return this.repo.add(entity);
	}
	
	public Student findById(int id) {
		Student found=this.repo.findById(101).get();
		found.setRollNumber(5600);
		return found;
		
		
	}
	


}
