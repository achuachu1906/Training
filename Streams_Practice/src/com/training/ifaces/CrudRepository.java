package com.training.ifaces;

import java.util.List;

import com.training.Student;

public interface CrudRepository  {
	
	public List<Student>findAll();
	public  boolean add(Student student);
	public Student findById(int id);
	public boolean remove(Student student);
	public Student update(Student oldname, String newname);
	

}
