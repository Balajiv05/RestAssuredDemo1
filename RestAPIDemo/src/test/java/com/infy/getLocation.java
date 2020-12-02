package com.infy;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getLocation {
	
	@Test
	void getLocation1()
	{
		//specify base URI
		RestAssured.baseURI="http://api.twitter.com/1.1/trends/closest.json?lat=37.781157&long=-122.400612831116";
		
		// Request object
		RequestSpecification httpReq_var=RestAssured.given();
		
		//response object
		Response response=httpReq_var.request(Method.GET);
		
		// print response in console
		String res_body=response.getBody().asString();
		System.out.println("Response Body is:"+res_body);
		
		
		//Status code validation
		int statuscode=response.getStatusCode();
		System.out.println("Status code is:"+statuscode);
		Assert.assertEquals(statuscode, 403);
				
		//status line verification
		String statusline=response.getStatusLine();
		System.out.println("status line is:"+statusline);
		
	}

}
