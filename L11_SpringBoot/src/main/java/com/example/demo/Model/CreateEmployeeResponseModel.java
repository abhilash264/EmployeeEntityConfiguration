package com.example.demo.Model;

import java.util.ArrayList;

public class CreateEmployeeResponseModel {
	
	private int id;
	private String name;
	private int sal;
	private String email;
	private int error;
	private String message;
	public CreateEmployeeResponseModel(int error,String message)
	{
		this.error=error;
		this.message=message;
	}
	public CreateEmployeeResponseModel(int id,String name,int sal,String email,String message)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.email=email;
		this.message=message;
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
	
	
	public int getError() {
		return error;
	}
	public void setError(int error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
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
	@Override
	public String toString() {
		return "CreateEmployeeResponseModel [id=" + id + ", name=" + name + ", sal=" + sal + ", email=" + email
				+ ", error=" + error + ", message=" + message + "]";
	}
	
}

