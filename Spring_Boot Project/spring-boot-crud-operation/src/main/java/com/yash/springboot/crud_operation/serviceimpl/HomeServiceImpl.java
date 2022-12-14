package com.yash.springboot.crud_operation.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.springboot.crud_operation.model.Employee;
import com.yash.springboot.crud_operation.repository.HomeRepository;
import com.yash.springboot.crud_operation.service.homeService;

@Service
public class HomeServiceImpl implements homeService {

	@Autowired
	HomeRepository hr;
	
	
	@Override
	public Iterable<Employee> getAllData() {
		
		return hr.findAll();
	}


	@Override
	public void savedata(Employee emp) {
		
		hr.save(emp);
		
	}


	@Override
	public Optional<Employee> getDataById(int eid) {
		
		return hr.findById(eid);
	}


	@Override
	public Optional<Employee> getDataByName(String ename) {
		
		return hr.findByEname(ename);
	}


	@Override
	public Employee updateData(Employee elp) {
		
		return hr.save(elp);
	}


	@Override
	public void deleteData(int eid) {
		
			hr.deleteById(eid);
		
	}


	

}
