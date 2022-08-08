package org.example.mockito.module1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.example.ifaces.StudentRepository;
import org.example.model.Student;
import org.example.services.StudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {
	
	@Mock
	StudentRepository studRepo;
	
	@Mock
	StudentService serviceMock;

	@InjectMocks
	StudentService studService;
	
	@DisplayName("Test Find All Method with Mockito Stub")
	@Test
	void testFindAll() {
		StudentRepository repo=Mockito.mock(StudentRepository.class);
		StudentService service=new StudentService(repo);
		
	     List<Student> list=new ArrayList<>();
	     list.add(new Student(101,"Ramesh"));
	     list.add(new Student(102,"Suresh"));
         when(studRepo.findAll()).thenReturn(list);
		 assertEquals(studService.findStudentSize(),2);
	}
	@Test
	@DisplayName("Test addWithCondition method of the service it should add elements"
			+ "only roll number is greater than 2000 else it should return a null value ")
	void testWithCondition() {
		Student achu=new Student(2001,"achu");
		studService.addWithRollNumCompare(achu);
		Mockito.verify(studRepo, Mockito.times(1)).add(achu);
	   
	   assertNotNull(studService.addWithRollNumCompare(achu));
	     }
	@Test
	void verifyAddWithCondition() {
		Student stud=new Student(2001,"achu");
		serviceMock.addWithRollNumCompare(stud);
		verify(serviceMock,times(1)).addWithRollNumCompare(stud);
	}

}
