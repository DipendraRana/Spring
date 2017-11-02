package com.bridgelabz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.dao.EmployeeDao;
import com.bridgelabz.model.Employee;

@RestController
public class MainRestController {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@RequestMapping("/")
	public String welcome() {
		return "Welcome to this Example";
	}
	
	@RequestMapping(value="/employees",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployee() {
		List<Employee> list=employeeDao.getAllEmployees();
		return list;
	}
	
	@RequestMapping(value="/employee/{employeeNo}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee(@PathVariable("employeeNo") String employeeNo) {
		return employeeDao.getEmployee(employeeNo); 
	}
	
	@RequestMapping(value="/employees",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public Employee addEmployee(Employee employee) {
		return employeeDao.addEmployee(employee);
	}
	
	@RequestMapping(value = "/employees",method = RequestMethod.PUT,produces =MediaType.APPLICATION_JSON_VALUE)
	public Employee updateEmployee(Employee emp) {
		return employeeDao.updateEmployee(emp);
	}
	
	@RequestMapping(value = "/employees/{empNo}",method = RequestMethod.DELETE,produces =MediaType.APPLICATION_JSON_VALUE)
    public void deleteEmployee(@PathVariable("empNo") String empNo) {
        employeeDao.deleteEmployee(empNo);
    }

}
