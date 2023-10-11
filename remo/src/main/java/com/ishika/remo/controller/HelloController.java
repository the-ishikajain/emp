package com.ishika.remo.controller;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ishika.remo.Entity.Employee;
import com.ishika.remo.repository.RepositoryEmployee;

@RestController
public class HelloController {
	RepositoryEmployee empRepository;

	@GetMapping (path="/getAllEmployeeS")
	public List<Employee> getAllEmployees()
	{
		List<Employee> empLst=empRepository.findAll();           //http://localhost:8080/getAllEmployees
		return empLst;
	}

	@PostMapping (path="/insertEmployee")
	public String insertEmployee(@RequestBody Employee empobj)
	{
	System.out.println("Received Data : " +empobj);
	empRepository.save(empobj);
	return "Record inserted successfulyy";
	}

	@PutMapping (path="/updateEmployee")
	public String updateEmployee(@RequestBody Employee empobj)
	{
		Optional<Employee> emo=empRepository.findById(empobj.getId());
		if(emo.isPresent())
		{
			Employee eu=emo.get();
			eu.setName(empobj.getName());
			eu.setDept(empobj.getDept());
			eu.setDesignation(empobj.getDesignation());
			empRepository.save(eu);
			return "Recode updated Successfully";
			
			
		}
		return "Unable to update record";
	}

	@DeleteMapping (path="/deleteEmployee/{id")
	public String deleteEmployee(@PathVariable int id)
	{
		System.out.println("Given id is : " +id);
		empRepository.deleteById(id);
		return "Record deleted Successfully";
		
	}
}
