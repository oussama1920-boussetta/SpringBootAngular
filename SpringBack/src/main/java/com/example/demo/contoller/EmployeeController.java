package com.example.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.RessourceNotFoundExeptions;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;


@RestController
@CrossOrigin("*")
@RequestMapping("/")
public class EmployeeController {
@Autowired
private EmployeeRepository employeeRepository;

@GetMapping("/employees")
public List<Employee> getAllEmployee(){
	return employeeRepository.findAll();
}
@PostMapping("/employees")
public void postEmployee(@RequestBody Employee employee){
	employeeRepository.save(employee);
}
@DeleteMapping("/employees/{id}")
public void deleteEmployee(@PathVariable Long id) {
	employeeRepository.delete(null);
}
@GetMapping("/getEmployee/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
	System.out.println(id);
		Employee employee=employeeRepository.findById(id)
				.orElseThrow(()->new RessourceNotFoundExeptions("Employee not exist with id :"+id));
		return employee;
	}
@PostMapping("/employee/{id}")
public ResponseEntity<Employee> updateEmployee(@PathVariable Long id,@RequestBody Employee employeeDetails){
	Employee employee=employeeRepository.findById(id)
			.orElseThrow(()->new RessourceNotFoundExeptions("Employee not exist with id :"+id));
	
employee.setFirstName(employeeDetails.getFirstName());
employee.setLastName(employeeDetails.getLastName());
employee.setMail(employeeDetails.getMail());
employee.setPassword(employeeDetails.getPassword());

Employee updateEmployee=employeeRepository.save(employee);
return ResponseEntity.ok(updateEmployee);
}
@DeleteMapping("/employeeAll")
	public void deleteAllEmp(){
	 employeeRepository.deleteAll();
	
}


}

