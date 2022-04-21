package com.training;

import com.training.model.Student;
import java.util.*;

public class HashSetApplication {

	public static void main(String[] args) {
		Student ram=new Student(101,"ram",78);
		Student shyam=new Student(102,"shyam",68);
		Student magesh=new Student(103,"magesh",88);
		Student chinnamagesh=new Student(101,"magesh",88);
		//create hash set
        HashSet<Student> set= new HashSet<>();
        set.add(ram);
        set.add(shyam);
        set.add(magesh);
        set.add(chinnamagesh);
        
        System.out.println(set);
        System.out.println(set.size());
	}

}
