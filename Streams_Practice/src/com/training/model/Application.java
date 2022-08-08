package com.training.model;

import java.util.List;

import com.training.Student;
import com.training.ifaces.CrudRepository;
import com.training.service.StudentService;

public class Application {
	
	public static void print(List <Student>args) {
		for(Student eachStudent:args)
        System.out.println(eachStudent);
		}

	public static void main(String[] args) {
		
		
		Student stu1=new Student(1,"archu",89);
		Student stu2=new Student(2,"bhuvi",98);
		
		CrudRepository service=new StudentService();
		System.out.println(service.add(stu1));
		System.out.println(service.add(stu2));
		
		System.out.println(service.findAll());
		System.out.println(service.findById(2));
		System.out.println(service.remove(stu2));
		System.out.println(service.findAll());
		
		System.out.println(service.update(stu1, "achuu"));

	}

}
