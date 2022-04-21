import java.util.List;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import com.training.services.BookService;

public class Application {
	public static void print(List<Book> args) {
		for(Book eachBook:args) {
			System.out.println(eachBook);
		}
	}

	public static void main(String[] args) {
		Book java= new Book(101,"java","suba",450);
		Book spring=new Book(102,"spring","mad",650);
		Book maven=new Book(103,"Maven","Harish",550);
		Book html=new Book(104,"Html","priya",1450);
		Book python=new Book(105,"python","Sathya",850);
		
		
		CrudRepository service=new BookService();		
		
		 System.out.println("Is Added:="+service.add(java));
		 System.out.println("Is Added:="+service.add(spring));
		 System.out.println("Is Added:="+service.add(maven));
		 System.out.println("Is Added:="+service.add(html));
		 System.out.println("Is Added:="+service.add(python));
		 
			 print(service.findAll());
			 System.out.println();
			 System.out.println(service.findById(105));
			 
			 System.out.println();
			 System.out.println(service.remove(html));
			 System.out.println(service.findAll().size());
			 System.out.println();
			 print(service.findAll());
			 print(service.findAll());
			 Book react= new Book(109,"react","hp",10000);
			 service.add(react);
			 print(service.findAll());
			 Book reactnew= new Book(109,"react","hp",10000);
			  service.update(react,reactnew);
			 print(service.findAll());
			 service.update(react,reactnew);
			 
			 System.out.println("Greater Than");
			// List<Book> bookList=((BookService)service).getBookGrtThan(800);
			// bookList.forEach(System.out::println);
			 
			 System.out.println("Using Streams");
			 ((BookService)service).findBooksGrtThan(100).forEach(System.out::println);
			
		//List<String> nameList =((BookService)service)
			 
		 
       
	}
	

}
