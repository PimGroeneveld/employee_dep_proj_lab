package com.example.codeclan.employeeservice;

import com.example.codeclan.employeeservice.models.Department;
import com.example.codeclan.employeeservice.models.Employee;
import com.example.codeclan.employeeservice.models.Project;
import com.example.codeclan.employeeservice.repositories.DepartmentRepository;
import com.example.codeclan.employeeservice.repositories.EmployeeRepository;
import com.example.codeclan.employeeservice.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeserviceApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void createNewDepAndEmp(){
		Department innovation = new Department("Innovation");
		departmentRepository.save(innovation);
		Employee employee = new Employee("Pete", "Johnson", 1367, innovation);
		employeeRepository.save(employee);
	}

	@Test
	public void createNewEmployeeAndProject(){
		Department innovation = new Department("Innovation");
		departmentRepository.save(innovation);
		Employee employee = new Employee("Pete", "Johnson", 1367, innovation);
		employeeRepository.save(employee);

		Project projectX = new Project(500);
		projectRepository.save(projectX);

		employee.addProject(projectX);
		projectX.addEmployee(employee);
		projectRepository.save(projectX);

	}



}
