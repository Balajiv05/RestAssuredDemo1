package com.infy;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Update {

@SuppressWarnings("unchecked")
@Test
void getUsrList()
{
//specify base URI
RestAssured.baseURI="https://reqres.in/api/users/5";

// Request object
RequestSpecification httpReq_var=RestAssured.given();

JSONObject obj=new JSONObject();
obj.put("name", "morpheus");
obj.put("job", "zion resident");

httpReq_var.header("Content-Type","application/json"); 
httpReq_var.body(obj.toJSONString());


//response object
Response response=httpReq_var.request(Method.PUT);

// print response in console
String res_body=response.getBody().asString();
System.out.println("Response Body is:"+res_body);

}

}

