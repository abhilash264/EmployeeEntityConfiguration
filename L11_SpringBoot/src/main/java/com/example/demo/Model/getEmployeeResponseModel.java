package com.example.demo.Model;
import java.util.*;
import com.example.demo.Entity.Employee;
import com.example.demo.Model.CreateEmployeeRequestModel;
public class getEmployeeResponseModel {

	private int id;
	private String message;
	private ArrayList<CreateEmployeeRequestModel> al;
	private CreateEmployeeRequestModel cs;
	public getEmployeeResponseModel(int id,String message)//error message
	{
		this.id=id;
		this.message=message;
	}
	public getEmployeeResponseModel(ArrayList<CreateEmployeeRequestModel> al)
	{
		this.al=al;
	}
	
	public int getid()
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<CreateEmployeeRequestModel> getAl() {
		return al;
	}
	public void setAl(ArrayList<CreateEmployeeRequestModel> al) {
		this.al = al;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "getEmployeeResponseModel [id=" + id + ", message=" + message + ", al=" + al + "]";
	}
	
}
