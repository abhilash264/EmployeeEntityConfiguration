package com.example.demo.service;
 import com.example.demo.Model.CreateEmployeeRequestModel;
 import com.example.demo.Model.CreateEmployeeResponseModel;
import com.example.demo.Model.getEmployeeResponseModel;
import com.example.demo.Entity.*;
import java.util.*;
public class EmployeeService {

	HashMap<Integer,CreateEmployeeRequestModel> hm=new HashMap<>();
	public CreateEmployeeResponseModel addEmployee(CreateEmployeeRequestModel emp)
	{
		CreateEmployeeResponseModel crm;
		ArrayList<CreateEmployeeRequestModel> emplist=new ArrayList<>();
		if(hm.containsKey(emp.getId()))
		{
			crm=new CreateEmployeeResponseModel(301,"Employee Already Exists");
		}
		else if(emp.getName()=="" || emp.getName()==null)
		{
			crm=new CreateEmployeeResponseModel(401,"Employee Name can not be empty");
		}
		else
		{
			hm.put(emp.getId(), emp);
			for(int id:hm.keySet())
			{
				emplist.add(hm.get(id));
			}
			crm=new CreateEmployeeResponseModel(emp.getId(),emp.getName(),emp.getSal(),emp.getEmail(),"Data Added Successfully");
		}
		return crm;
	}
	
	public getEmployeeResponseModel load()
	{
		CreateEmployeeRequestModel e1=new CreateEmployeeRequestModel(101,"Abhilash",10000,"abc@gmail.com");
		hm.put(e1.getId(), e1);
		e1=new CreateEmployeeRequestModel(102,"java technocrat",20000,"def@gmail.com");
		hm.put(e1.getId(), e1);
		e1=new CreateEmployeeRequestModel(103,"GFG",30000,"ghi@gmail.com");
		hm.put(e1.getId(), e1);
		
		return getAll();
	}
	
	public getEmployeeResponseModel getAll()
	{
		ArrayList<CreateEmployeeRequestModel> al=new ArrayList<>();
		getEmployeeResponseModel res;
		if(hm.isEmpty())
		{
			res=new getEmployeeResponseModel(101,"No data to show");
		}
		else
		{
			for(int id:hm.keySet())
			{
				al.add(hm.get(id));
			}
		}
		res=new getEmployeeResponseModel(al);
		return res;
	}
	
	
}
