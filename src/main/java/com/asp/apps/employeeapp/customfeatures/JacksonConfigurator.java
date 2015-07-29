package com.asp.apps.employeeapp.customfeatures;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.Produces; 

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;
@Provider
@Produces("application/json")
public class JacksonConfigurator implements ContextResolver<ObjectMapper> {

    private ObjectMapper mapper = new ObjectMapper();

    public JacksonConfigurator() {
    	this.mapper = new ObjectMapper();  
        this.mapper.setDateFormat(new SimpleDateFormat("MM.dd.yyyy"));  
        this.mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);  

    }

    public ObjectMapper getContext(Class<?> arg0) {
        return mapper;
    }

}
