package com.example.demo.Model;

public class CreateEmployeeRequestModel {

	private int id;
	private String name;
	private int sal;
	private String email;
	public CreateEmployeeRequestModel()
	{
		super();
	}
	public CreateEmployeeRequestModel(int id,String name,int sal,String email)
	{
		super();
		this.id=id;
		this.name=name;
		this.email=email;
		this.sal=sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString()
	{
		return "Employee id:"+id+"name"+name;
	}
}
