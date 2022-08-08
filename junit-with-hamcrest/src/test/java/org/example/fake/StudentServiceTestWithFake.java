package org.example.fake;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.example.model.Student;
import org.example.services.StudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentServiceTestWithFake {
	@Test
	@DisplayName("Test Add Method Return inserted object back")
	void testAddMethod() {
		
		StudentRepoFake fake=new StudentRepoFake();
		
		StudentService service= new StudentService(fake);
		Student ram=new Student(101,"ram");
		Student actual = service.add(ram);
		assertEquals(actual,ram);
	}

	@Test
	@DisplayName("Test findall method return all the elements added ")
	void testFindAllMethod() {
		StudentRepoFake fake=new StudentRepoFake();
		StudentService service=new StudentService(fake);
		Student ram=new Student(101, "Ram");
		Student sham=new Student(102, "sham");
		service.add(ram);
		service.add(sham);
		int actual=service.findAll().size();
		int expected=2;
		assertEquals( expected,actual);
	}
	}