package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.PayRollOperationsController;
import com.nt.modeller.Employee;

@SpringBootApplication
public class Springbootpr03LyeredAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Springbootpr03LyeredAppApplication.class, args);

		PayRollOperationsController controller = ctx.getBean("payroll", PayRollOperationsController.class);
		try {

			// invoke the b meathod
			List<Employee> list = controller.showEmployeeByDesgs("clerk", "maneger", "salesman");
			list.forEach(emp -> {
				System.out.println(emp);
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
