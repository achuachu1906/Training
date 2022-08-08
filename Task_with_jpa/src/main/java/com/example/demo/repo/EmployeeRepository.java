package com.example.demo.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findByEmployeeId(int srch);

	public List<Employee> findByLocation(String abc);
	
	public List<Employee> findByDateOfBirth(LocalDate date);

	public List<Employee> findByLocationAndSkillSet(String srchLoc, String srchSkill);
	
	public List<Employee> findBySkillSet(String string);
	
	@Query(nativeQuery=true,value="select employee_id,date_of_birth,employee_name,location,phone_number,skill_set from achhhh_employee where location=:loc and skill_set=:skill ")
	
	public List<Employee> getByLocationAndSkillSet(@Param("loc")String str,@Param("skill")String str1);
	
	public List<Employee> getByLocationOrSkillSet(@Param("loc")String str,@Param("skill")String str1);
	

}
