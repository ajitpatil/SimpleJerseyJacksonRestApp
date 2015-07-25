package com.asp.apps.employeeapp.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.core.MediaType;

import com.asp.apps.employeeapp.customfeatures.JacksonConfigurator;
import com.asp.apps.employeeapp.model.Employee;

@Path("/employee")
public class EmployeeService implements Feature {
	
	@GET	
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Employee getEmployee(){
		
		Employee employee = new Employee();
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		
		employee.setEmployeeId(1);
		employee.setFirstName("John");
		employee.setLastName("Smith");
		employee.setGender('M');
		try {
			employee.setBirthDate(sdf.parse("04-11-1984"));
			employee.setHireDate(sdf.parse("05-16-2011"));
		} catch (ParseException e) {			
			e.printStackTrace();
		}
		
		return employee;
	}

	public boolean configure(FeatureContext featureContext) {
		featureContext.register(JacksonConfigurator.class);
		return true;
	}	
	
}
