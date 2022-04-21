package com.training;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.training.model.Student;

public class TreeSetApplication {

	public static void main(String[] args) {
		Student ram=new Student(101,"anand",78);
		Student shyam=new Student(102,"basky",68);
		Student magesh=new Student(103,"magesh",88);
		Student chinnamagesh=new Student(101,"magesh",88);
		//create hash set
        Set<Student> set= new TreeSet<>();
        set.add(ram);
        set.add(shyam);
        set.add(magesh);
        set.add(chinnamagesh);
  
        for(Student eachStudent:set) {
        	System.out.println(eachStudent.getFirstName());
        }
	}

}
