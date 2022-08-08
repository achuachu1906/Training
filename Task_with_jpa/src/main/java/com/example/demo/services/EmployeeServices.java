package com.example.demo.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeServices {
	private EmployeeRepository repo;
	
    @Autowired
	public EmployeeServices(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}
    
    public Employee add(Employee entity) {
    return this.repo.save(entity);
    }
    
    public List<Employee> findAll() {
    	return this.repo.findAll();
    }
    public List<Employee> findById(int id){
    	return this.repo.findByEmployeeId(id);
    }
    public List<Employee> findByLocAndSkill (String srcLoc,String srcSkill){
    	
    	return this.repo.getByLocationAndSkillSet(srcLoc, srcSkill);
    }
    public List<Employee> findBySkillSet(String string){
    	return this.repo.findBySkillSet(string);
    }
    public List<Employee> findByLocation(String str){
    	return this.repo.findByLocation(str);
    }
    public List<Employee> findByDob(LocalDate dat){
    	return this.repo.findByDateOfBirth(dat);
    }
    public List<Employee> findByLocOrSkill(String srcLoc1,String srcSkill1){
    	return this.repo.getByLocationOrSkillSet(srcLoc1, srcSkill1);
    }
	

}
