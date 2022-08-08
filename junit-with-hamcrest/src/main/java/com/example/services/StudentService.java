package com.example.services;

import java.util.List;

import org.example.ifaces.ProfessorRepository;
import org.example.ifaces.StudentRepository;
import org.example.model.Student;

public class StudentService {
	private StudentRepository studRepo;
	private ProfessorRepository profRepo;
	public StudentService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentService(StudentRepository studRepo, ProfessorRepository profRepo) {
		super();
		this.studRepo = studRepo;
		this.profRepo = profRepo;
	}
	
	public Student add(Student entity) {
		
		return this.studRepo.add(entity);
	}
	
	public List<Student> findAll(){
		return this.studRepo.findAll();
	}
}