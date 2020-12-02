package com.infy;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetMethod {

	@Test
	void getUsrList()
	{
		//specify base URI
		RestAssured.baseURI="https://reqres.in/api/users?page=9";
		
		// Request object
		RequestSpecification httpReq_var=RestAssured.given();
		
		//response object
		Response response=httpReq_var.request(Method.GET);
		
		// print response in console
		String res_body=response.getBody().asString();
		System.out.println("Response Body is:"+res_body);
		

		// print response in JSON format
		System.out.println(" Pretty: "+response.prettyPrint().toString());





	}

	}
