package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.modeller.Employee;

@Repository("EmplyeeDAO")
public class EmployeeDAO implements IEmployeeDAO {

	private static final String GET_EMPLOYEE_BY_DESIGNATION = "Select * from employee where desg in(?,?,?)order by desg";
	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getEmployeeByDesg(String desg1, String desg2, String desg3) throws Exception {
		System.out.println("EmployeeDaoImp.getEmplyeesByDesgs()::ds" + ds.getClass());
		List<Employee> list = null;
		// get pooled jdbc connection object
		try (Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(GET_EMPLOYEE_BY_DESIGNATION)) {
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			try (ResultSet rs = ps.executeQuery()) {
				list = new ArrayList<>();
				while (rs.next()) {
					Employee emp = new Employee();
					emp.setAddrs(rs.getString("addrs"));
					emp.setEno(rs.getInt("eno"));
					emp.setEname(rs.getString("ename"));
					emp.setSalary(rs.getDouble("salary"));
					
					
					emp.setDesg(rs.getString("desg"));
					emp.setDeptno(rs.getInt("deptno"));
					list.add(emp);
				}
			}

		} catch (Exception e) {
		}
		return list;
	}
}
