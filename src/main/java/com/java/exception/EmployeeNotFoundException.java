package com.java.exception;

public class EmployeeNotFoundException extends RuntimeException implements IAppExceptionMgr {

	public EmployeeNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
