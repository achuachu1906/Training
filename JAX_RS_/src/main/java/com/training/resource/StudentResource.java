package com.training.resource;

import java.util.List;

import com.training.model.Student;
import com.training.services.StudentService;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
	import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
	
	
	@Path("/students")
	public class StudentResource {
		
		private static  StudentService service=new StudentService();
		
		
		public StudentResource() {
			super();
		}
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public  List<Student> getAllStudent() {
			return service.getAll();
		}
		
		@GET
		@Path("/{rollNumber}")
		@Produces(MediaType.APPLICATION_JSON)
		public Student findById(@PathParam("rollNumber")int id) {
			return service.findById(id).orElseThrow(()-> new RuntimeException("Id not found"));
		}
		
		@POST
		@Produces(MediaType.APPLICATION_JSON)
		public Response add(Student student) {
			boolean result=service.add(student);
			if(result) {
				return Response.ok(student).status(201).build(); 
			}
			else {
				return Response.status(400,"Not Created").build();
			}
			
		}
		@DELETE
		@Path("/{rollNumber}")
		@Produces(MediaType.APPLICATION_JSON)
		public boolean remove(@PathParam("rollNumber")int id) {
			return service.remove(id);

		}
		@PUT
		@Path("/{rollNumber}")
		@Produces(MediaType.APPLICATION_JSON)
		public Student update(@PathParam("rollNumber")  int id , Student newStudent)
			{
				return service.update(id,newStudent);
			}}