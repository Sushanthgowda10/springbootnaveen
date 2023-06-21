package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.nt.modeller.Employee;
import com.nt.service.IEmployeeManagementService;

@Controller("payroll")
public class PayRollOperationsController {
	@Autowired
	private IEmployeeManagementService service;
	
	
	public List<Employee> showEmployeeByDesgs(String desg1,String desg2,String desg3) throws Exception {
		System.out.println("PayRollOperationsController.showEmployeesByDesgs()");
	
	List<Employee>list=service.fetchEmployeesByDesgs(desg1,desg2,desg3);
	return list;
	
	}
}
