package org.example.stub;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.services.StudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentServiceTestWithStub {
	@Test
	@DisplayName("Test FindAll Method with Stub To Return All the Elements Added")
	void testFindAllMethod() {
		StudentRepositoryStub stub=new StudentRepositoryStub();
		StudentService service= new StudentService(stub);
		assertEquals(service.findAll().size(), 2);
	}

}
