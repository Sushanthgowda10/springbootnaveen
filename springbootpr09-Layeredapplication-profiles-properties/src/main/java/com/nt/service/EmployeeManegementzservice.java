package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.modeller.Employee;

@Service("service")
public class EmployeeManegementzservice implements IEmployeeManagementService {

	@Autowired
	private IEmployeeDAO dao;
	@Override
	public List<Employee> fetchEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
		return dao.getEmployeeByDesg(desg1, desg2, desg3) ;
	}

}
