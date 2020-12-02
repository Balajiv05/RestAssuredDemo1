package com.infy;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class deleteEmployeeRecord {
	
	@Test
	void deleteEmployee()
	{
		//specify base URI
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/delete/6";
		
		// Request object
		RequestSpecification httpReq_var=RestAssured.given();
		
		//response object
		Response response=httpReq_var.request(Method.DELETE);
		
		// print response in console
		String res_body=response.getBody().asString();
		System.out.println("Response Body is:"+res_body);
		
		// print response in JSON format
		System.out.println(" Response in JSON Format: "+response.prettyPrint().toString());
		
		//Status code validation
		int statuscode=response.getStatusCode();
		System.out.println("Status code is:"+statuscode);
		Assert.assertEquals(statuscode, 200);
				
		//status line verification
		String statusline=response.getStatusLine();
		System.out.println("status line is:"+statusline);
		
	}

}
