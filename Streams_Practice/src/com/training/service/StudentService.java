package com.training.service;

import java.util.ArrayList;
import java.util.List;

import com.training.Student;
import com.training.ifaces.CrudRepository;

public class StudentService implements CrudRepository {
	
	private ArrayList<Student> studentList;
	

	public StudentService() {
		super();
		this.studentList= new ArrayList<>();
		// TODO Auto-generated constructor stub
	}


	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return this.studentList;
	}


	@Override
	public boolean add(Student student) {
		// TODO Auto-generated method stub
		return this.studentList.add(student);
	}


	@Override
	public Student findById(int id) {
		Student found=null;
		for(Student eachStudent:this.studentList) {
			if(eachStudent.getId()==id) {
				found=eachStudent;
		}
		}
		return found;
}


	@Override
	public boolean remove(Student student) {
		
		return this.studentList.remove(student);
	}


	@Override
	public Student update(Student oldName, String newName) {
		if(this.studentList.contains(oldName)) {
//			int str=this.studentList.indexOf(oldName);--
			//String newName2=
			oldName.setName(newName);
					}else {
			
		}
		return oldName;
	}

	
}
