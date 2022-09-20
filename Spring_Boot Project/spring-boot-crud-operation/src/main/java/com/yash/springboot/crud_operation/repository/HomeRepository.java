package com.yash.springboot.crud_operation.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.springboot.crud_operation.model.Employee;

@Repository
public interface HomeRepository extends CrudRepository<Employee,Integer> {
	
	
	public Optional<Employee> findByEname(String ename);

}
