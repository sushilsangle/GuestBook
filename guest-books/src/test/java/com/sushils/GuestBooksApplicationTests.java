package com.sushils;

import com.sushils.model.Employee;
import com.sushils.repository.EmployeeRepository;
import com.sushils.service.EmployeeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.stream.Stream;

import static org.mockito.Mockito.when;

@SpringBootTest
class GuestBooksApplicationTests {

	@Autowired
	private EmployeeService service;

	@MockBean
	private EmployeeRepository repository;

	@Test
	public void getEmployeeTest(){
		when(repository.findAll()).thenReturn((List<Employee>) Stream
		.of(new Employee(101,"Sushil","sangale","ss@gmail.com","7020843440","image")));

		Assertions.assertEquals(2,service.getAllEmployees().size());
	}

	@Test
	void contextLoads() {
	}

}
