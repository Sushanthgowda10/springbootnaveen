package com.nt.service;

import java.util.List;

import com.nt.modeller.Employee;

public interface IEmployeeManagementService {
	public List<Employee> fetchEmployeesByDesgs(String desg1,String desg2,String desg3) throws Exception;

}
