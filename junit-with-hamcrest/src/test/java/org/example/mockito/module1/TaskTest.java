package org.example.mockito.module1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.example.ifaces.TaskRepository;
import org.example.model.Student;
import org.example.services.TaskService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class TaskTest {
	@Mock
	TaskRepository repo;
	
	@InjectMocks
	TaskService service;
	
	@DisplayName("verify whether the element found by method and return it")
	@Test
	void testWithStudent() {
		Student achu=new Student(101,"achu");
		Student amu=new Student(102,"amu");
		when(repo.findById(101)).thenReturn(Optional.of(achu));
		Student expected=service.findById(101);
		assertEquals(expected,achu);
	}
	@Test
	public void shouldThrowExceptionWhenElementNotFound() {
     Student stud=new Student(101,"achu");
     when(repo.findById(anyInt())).thenThrow(RuntimeException.class);
     Student expected =service.findById(3455);
     assertEquals(expected, stud);
	}
	
}
