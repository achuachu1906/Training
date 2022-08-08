package org.example;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.example.model.Book;
import com.example.service.BookService;

public class BookServiceTest {
	BookService service=null;
	
	@BeforeAll
	public static void init(TestInfo info) {
		System.out.println(info.getDisplayName()+"Called");
	}
	
	@BeforeEach
	public void setUp(TestInfo info) {
		service=new BookService();
		System.out.println(info.getDisplayName()+"Called");
		}

	@Test
	@DisplayName(value="Get Method should not return a null value")
	void testGetBookMethod() {
		//BookService service = new BookService();
		Object actual=service.getBookList();
		assertNotNull(actual);
		}
	@Test
	@DisplayName(value="add Method should return 1 for success and 0 for failure to insert ")
	void testAddMethod() {
		//BookService obj = new BookService();
        int actual = service.addBook(new Book());
        int expected = 0;
        
        assertEquals(expected,(int)actual);
	}
	@Test
	@DisplayName(value="add Method should return 1 for success and 0 for failure to insert ")
	void testAddMethodReturn() {
		//BookService obj = new BookService();
        int actual = service .addBook(new Book());
        int expected = 0;
        
        assertEquals(expected,actual);
	}
	@Test
	@DisplayName(value="addBook Method should not Accept Dupilcate")
	void testDuplicateNotAllowed() {
	//BookService service=new BookService();
	 Book Java=new Book(1001, "Java", 700);
	 Book list=new Book(1001,"Java", 700 );
	 int value = service.addBook(Java);
	 int result = service.addBook(list);
	 int expected=0;
	 assertEquals(expected, result);

	}
	@Test
	@DisplayName(value = "If the element is not found in collection removeBook should return throw RunTimeException"
			+ "with message element is not found ")
	void testRemove() {
	Throwable exception=assertThrows(RuntimeException.class,()->
	service.removeBook(new Book(103,"Maths",800)));
	assertEquals("Element not found",exception.getMessage());
	}
	
	@ParameterizedTest
	@DisplayName(value="Test if getBestBook method has the value Head First Java in one first three positions")
	@ValueSource(ints= {0,1,2})
	void testPosition(int pox) {
		System.out.println(System.getProperty("os.name"));
		assumeTrue(System.getProperty("os.name").equals("windows 10"));
		assertEquals("Head First Java", service.getsBestBooks().get(pox));
	}
	
	
	}