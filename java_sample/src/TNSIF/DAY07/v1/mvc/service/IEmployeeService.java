//program to define interface for CRUD operation
package com.tnsif.daytwentythree.v1.mvc.service;

import java.sql.SQLException;
import java.util.List;

import com.tnsif.daytwentythree.v1.mvc.Employee;

public interface IEmployeeService {
	
	List<Employee> getAllEmployees() throws SQLException;
	Employee getEmployeeById(int empId) throws SQLException;
	void addEmployee(Employee e)throws SQLException;
	boolean deleteEmployee(int empId) throws SQLException;
	boolean updateEmployee(int empId, Employee e) throws SQLException;
	
}
