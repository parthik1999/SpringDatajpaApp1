package com.parthik;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired 
	EmployeeDao dao;
	
	@GetMapping("/hello")
	public String sayHello()
	{
		
//		To store Value
		
//		Employee emp = new Employee();
//		emp.setName("Parthik");
//		emp.setAddress("Talod");
//		emp.setSalary(10800);
//		
//		Employee e = dao.save(emp);
//		
//		return "Welcome to Spring Data JPA"+e;
		
		
//		====================================
		
//		TO fetch the value by id
		
//	Optional<Employee> opt = dao.findById(2);
//	if(opt.isPresent())
//	{
//		Employee emp = opt.get();
//		return ""+emp;
//	}
//	else
//		
//	{
//		return "Not Found";
//	}
//	
//	
	
		
		
//		========================================
//		to fetch all the values
		
//		List<Employee> list = dao.findAll();
//		
//		return "Result is"+list;
//================================================
//		to delete value
		
//		public void delete(T t)
//		dao.delete(null)
//		public void deletebyId(Integer id)
//		dao.deleteById(null)
//		public void deleteAll();
//		dao.deleteAll();
		
//		=============================================
		
//		update the record
		
		Employee emp = dao.findById(1).get();
		emp.setSalary(emp.getSalary()+500);
		Employee emp2 = dao.save(emp);
		return ""+emp;
		
		
}
}