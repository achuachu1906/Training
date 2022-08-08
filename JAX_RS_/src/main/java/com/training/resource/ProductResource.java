package com.training.resource;
import java.util.List;
import com.example.demo.services.ProductService;
import com.example.entity.Product;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/products")
public class ProductResource {
	private static  ProductService service=new ProductService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> findAll(){
		return service.findAll();
		
		
	}
	@GET
	@Path("/srch/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findById(@PathParam("id")int id){
		try {
			Product entity=service.findById(id).orElseThrow(()->new RuntimeException("Id not found"));
			return Response.ok(entity).build();
			}catch(RuntimeException e) {
			e.printStackTrace();
		return Response.ok("Id not found").status(400,"id not found").build();
			}
	}
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response add(Product entity) {
        int result=service.addProduct(entity);
		System.out.println("result"+result);
		if(result!=0) {
			
			return Response.ok(entity).status(201).build();
			
		}else {
			
			return Response.status(400,"Not Created").build();
		}
	}		
	@DELETE
	@Path("/{productId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response remove(@PathParam("productId")int id) {
		return service.remove(id);

	}
}