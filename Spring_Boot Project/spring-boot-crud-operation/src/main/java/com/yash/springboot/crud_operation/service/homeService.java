package com.yash.springboot.crud_operation.service;

import java.util.Optional;

import com.yash.springboot.crud_operation.model.Employee;

public interface homeService {

	public Iterable<Employee> getAllData();

	public void savedata(Employee emp);

	public Optional<Employee> getDataById(int eid);

	public Optional<Employee> getDataByName(String ename);

	public Employee updateData(Employee elp);

	public void deleteData(int eid);

	

	

	

	

}
