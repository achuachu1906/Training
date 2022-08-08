package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import javax.persistence.EntityNotFoundException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.CabDriver;
import com.example.demo.services.CabDriverService;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class TestServiceLayerApplicationTests {
	
	@Autowired
	CabDriverService service;
	
	@BeforeAll
	void setUp() {
		CabDriver driver=new CabDriver(1010,"Jagan",8745,"Chennai",LocalDate.of(1997, 10, 11),4.5);
		service.save(driver);
	}

	@Test
	@DisplayName("Find all method should return a Empty Array")
	void testFindAll() {
		
		assertTrue(service.findAll().isEmpty());
	}

	@Test
	@DisplayName("Find all method should return an Array with element")
	void testFindAllSuccess() {
		
		assertFalse(service.findAll().isEmpty());
	}
	@Test
	@DisplayName("Find By Id Method should return an element with the given id")
	void testFindById() {
		CabDriver driver=service.findById(1010).orElseThrow(EntityNotFoundException::new);
		assertEquals("Jagan", driver.getDriverName());
	}
	


}
