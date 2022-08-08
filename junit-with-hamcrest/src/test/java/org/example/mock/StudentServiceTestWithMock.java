package org.example.mock;

import org.example.model.Student;
import org.example.services.StudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentServiceTestWithMock {
	
	@DisplayName(value="Test Add Method With Mock")
	@Test
	void testAddWithMock() {
		StudentServiceMock mock=new StudentServiceMock();
		StudentService service=new StudentService(mock);
		
		Student kavi=new Student(892,"Kavi");
		Student kavya=new Student(893,"Kavya");
		
		service.add(kavi);
		service.add(kavya);
		
		mock.verify(kavi, 2);
		mock.verify(kavi, 3);
	}

}
