package com.training.jax_rs_Client;
import com.example.entity.Product;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class ProductClient {
       public static void main(String[]args) {
    	  Client client=ClientBuilder.newClient();
    	WebTarget target=client.target("http://localhost:4040/products");
    	Invocation.Builder builder=target.request(MediaType.APPLICATION_JSON);
    	Response resp=builder.get();
    	//String object=resp.readEntity(String.class);
    	//System.out.println(object);
//    	Product object1=resp.readEntity(Product.class);
//    	System.out.println(object1);
//    	Product toAdd = new Product(91,"hhu",500);
//    	Response response=builder.post(Entity.entity(toAdd, MediaType.APPLICATION_JSON));
//    	System.out.println(response.getStatus());
//    	System.out.println(response.readEntity(String.class));
//       }
//}
    	int ch = 1;
		if(ch==1) {
		Product[] list=resp.readEntity(Product[].class);
		for(Product eachproduct:list) {
			System.out.println(eachproduct);
		}
		}
		//findall
		if(ch==2) {
			String object=resp.readEntity(String.class);
			System.out.println(object);
		}
		//findbyid
		if(ch==3) {
			WebTarget findByIdTarget = target.path("/srch/76");
			Invocation.Builder builder2 = findByIdTarget.request(MediaType.APPLICATION_JSON);

			Product object2=resp.readEntity(Product.class);
			System.out.println(object2);
		}
		if(ch==4) {
			Product toAdd = new Product(77,"eyeliner", 1500);
			Response response = builder.post(Entity.entity(toAdd, MediaType.APPLICATION_JSON));
	    	System.out.println(response);
		}
    	
	}}
