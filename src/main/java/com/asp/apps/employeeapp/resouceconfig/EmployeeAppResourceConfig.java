package com.asp.apps.employeeapp.resouceconfig;

import org.glassfish.jersey.server.ResourceConfig;

public class EmployeeAppResourceConfig extends ResourceConfig{
	
	public EmployeeAppResourceConfig() {
		
		register(com.asp.apps.employeeapp.services.EmployeeService.class);
	}
}
