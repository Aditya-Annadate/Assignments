package com.yash.springboot.crud_operation.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.springboot.crud_operation.exception.CustomExceptionForNullObj;
import com.yash.springboot.crud_operation.model.Employee;
import com.yash.springboot.crud_operation.service.homeService;

@RestController
public class HomeController {
	
	@Autowired
	homeService hm;
	
//	@GetMapping("/getalldata")
	@GetMapping(path="/getalldata",produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<Iterable<Employee>> getAllData()
	{
		Iterable<Employee> list	=hm.getAllData();
		
		return new ResponseEntity<Iterable<Employee>>(list,HttpStatus.FOUND);	
	}
	
	
//	@PostMapping("/savedata")
	@PostMapping(path="/savedata",produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<String> saveData(@RequestBody Employee emp)
	{
		hm.savedata(emp);
		
		return new ResponseEntity<String>("Data is Saved",HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getById/{eid}")
	public  ResponseEntity<Optional<Employee>> getById(@PathVariable("eid") int eid)
	{
		Optional<Employee> list	=hm.getDataById(eid);
		
		return new ResponseEntity<Optional<Employee>>(list,HttpStatus.FOUND);
	}
	
	@GetMapping("/getbyname/{ename}")
	public ResponseEntity<Optional<Employee>> getByName(@PathVariable("ename") String ename)
	{
		
		Optional<Employee> list1 =hm.getDataByName(ename);
		
		return new ResponseEntity<Optional<Employee>>(list1,HttpStatus.FOUND);
	}
	
	
//	@PutMapping("/updateData")
	@PutMapping(path="/updateData",produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<Employee> updateData(@RequestBody Employee elp)
	{
		Employee ee	=hm.updateData(elp);
		
		if(ee==null)
		{
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
		else {
			
			return new ResponseEntity<Employee>(ee,HttpStatus.valueOf(201));
		}
			
	}
	
	
//	@DeleteMapping("/deleteData/{eid}")
	@DeleteMapping(path="/deleteData/{eid}",produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<String> deleteData(@PathVariable("eid") int eid)
	{
		if(eid<=0)
		{
			return new ResponseEntity<String>("Employee Id is Invalid",HttpStatus.NOT_FOUND);
		}
		else {
		
		hm.deleteData(eid);
		
		return new ResponseEntity<String>("Data deleted",HttpStatus.ACCEPTED);
		
		}
		
	}
	
	
	
}
