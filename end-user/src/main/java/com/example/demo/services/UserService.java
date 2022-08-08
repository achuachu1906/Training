package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;

@Service
public class UserService {
	
	private UserRepository repo;

	@Autowired
	public UserService(UserRepository repo) {
		super();
		this.repo = repo;
	}

	public List<User> findAll(){
		return repo.findAll();
	}
	
    public User save(User entity) {
    	return repo.save(entity);
    }

    public Optional<User> findById(int id){
    	return repo.findById(id);
    }

	
	
	
	

}
