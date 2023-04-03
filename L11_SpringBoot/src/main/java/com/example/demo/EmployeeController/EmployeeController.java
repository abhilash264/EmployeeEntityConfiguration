package com.example.demo.EmployeeController;
import com.example.demo.service.EmployeeService;
import com.example.demo.Model.CreateEmployeeRequestModel;
import com.example.demo.Model.CreateEmployeeResponseModel;
import com.example.demo.Model.getEmployeeResponseModel;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/employee")
public class EmployeeController {

	EmployeeService es=new EmployeeService();
	
	@RequestMapping("/add")
	public String getName()
	{
		return "Abhilash";
	}
	@PostMapping("/create")
	public CreateEmployeeResponseModel addEmployee(@RequestBody CreateEmployeeRequestModel emp)
	{
		return es.addEmployee(emp);
	}
	@RequestMapping("/load")
	public getEmployeeResponseModel getEmployeeData()
	{
		return es.load();
	}

	@RequestMapping("/get")
	public getEmployeeResponseModel getdata()
	{
		return es.getAll();
	}
	
	
}
