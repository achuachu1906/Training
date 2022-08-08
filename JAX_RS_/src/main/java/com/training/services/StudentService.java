package com.training.services;
import java.util.*;
import java.util.stream.*;

import com.training.model.Student;

public class StudentService {
	
	private List<Student> studentList = new ArrayList<Student>();

	public StudentService() {
		super();
	}
	public boolean add(Student student) {
		return this.studentList.add(student);
		
	}
	public List<Student>getAll(){
		return this.studentList;
	}
	
	public Optional<Student> findById(int id){
		return this.studentList.stream().filter(e-> e.getRollNumber()==id).findFirst();
		
	}
	
	public boolean remove(int id) {
		return this.studentList.removeIf(e->e.getRollNumber()==id);
	}
	
	
public Student update (int id,Student newValue)
{
	int idxpos=this.studentList.indexOf(findById(id).get());
	return this.studentList.set(idxpos, newValue);
	
}

}