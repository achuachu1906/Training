package org.training.model;

import org.springframework.stereotype.Service;
import javax.websocket.server.ServerEndpoint;

@Service
public class Book {
	
	public double getDiscount(String bookName) {
		return 0.10;
	}
	

}
