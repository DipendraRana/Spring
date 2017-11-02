package com.bridgelabz.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.bridgelabz.model.Employee;

@Repository
public class EmployeeDao {
	
	private static Map<String,Employee> employeeMap=new HashMap<String,Employee>();
	
	static {
		initEmp();
	}
	
	private static void initEmp() {
		Employee employee1=new Employee("1", "Ahishek", "Manager");
		Employee employee2=new Employee("2", "Rakesh", "Junior Engineer");
		
		employeeMap.put(employee1.getEmpNo(), employee1);
		employeeMap.put(employee2.getEmpNo(), employee2);
	}
	
	public Employee getEmployee(String employeeNo) {
        return employeeMap.get(employeeNo);
    }
	
	public Employee addEmployee(Employee employee) {
        employeeMap.put(employee.getEmpNo(), employee);
        return employee;
    }
	
	 public Employee updateEmployee(Employee employee) {
	    employeeMap.put(employee.getEmpNo(), employee);
	    return employee;
	}
	 
	 public void deleteEmployee(String employeeNo) {
	    employeeMap.remove(employeeNo);
	 }
	 
	 public List<Employee> getAllEmployees() {
	    Collection<Employee> collection = employeeMap.values();
	    List<Employee> list = new ArrayList<Employee>();
	    list.addAll(collection);
	    return list;
	 }
}
