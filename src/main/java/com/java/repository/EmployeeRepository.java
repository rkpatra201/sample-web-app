package com.java.repository;

import java.util.LinkedHashMap;
import java.util.Map;

import com.java.exception.EmployeeNotFoundException;
import com.java.model.EmployeeModel;

public class EmployeeRepository {

	private static Map<Integer, EmployeeModel> employeeDataMap = loadEmployeeDataMap();

	private static Map<Integer, EmployeeModel> loadEmployeeDataMap() {
		Map<Integer, EmployeeModel> employeeDataMap = new LinkedHashMap<Integer, EmployeeModel>();
		System.out.println("Employee Data Loaded");
		employeeDataMap.put(1, new EmployeeModel("1", "NAME-1", "CITY-1"));
		employeeDataMap.put(2, new EmployeeModel("2", "NAME-2", "CITY-2"));
		return employeeDataMap;
	}

	public EmployeeModel getEmployeeName(Integer id) {
		System.out.println("get-->size" + employeeDataMap.size());
		EmployeeModel result = employeeDataMap.get(id);
		if (result == null)
			throw new EmployeeNotFoundException("1404,Employee not found for id: " + id);
		return result;
	}

	public synchronized int addEmployee(String name, String city) {
		int size = employeeDataMap.size();
		employeeDataMap.put(size + 1, new EmployeeModel(String.valueOf(size + 1), name, city));
		System.out.println("EMployee added with id: " + (size + 1));
		System.out.println("add-->size" + employeeDataMap);
		return employeeDataMap.size();
	}

}
